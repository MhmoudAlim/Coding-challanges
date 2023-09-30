package concepts_playground

import kotlinx.coroutines.sync.Mutex



class MutableChatManger {
    data class Message(val id: String, val deliveryState: DeliveryState)
    enum class DeliveryState { Delivered, Send, Undelivered, Read }

    private val allMessages = mutableListOf<Message>()
    fun onMessageReceived(message: Message) {
        allMessages.add(message)
    }

    fun onMessageDeliveryStateChanged(messageId: String, state: DeliveryState) {
        //if current message index is 3
        //then at the same time before 'allMessages' finishes updating the message with the index
        //the list might be already updated by another thread then the 'messageIndex' might not be valid now (+1 or -1)
        //hence we might end up updating the wrong message
        val messageIndex = allMessages.indexOfFirst { it.id == messageId }

        if (messageIndex >= 0) {
            val message = allMessages[messageIndex]
            allMessages[messageIndex] = message.copy(deliveryState = state)
        }
    }
}

class ImmutableChatManger {
    data class Message(val id: String, val deliveryState: DeliveryState)
    enum class DeliveryState { Delivered, Send, Undelivered, Read }

    val lock = Any()
    private var allMessages = listOf<Message>()
    fun onMessageReceived(message: Message) {
        // if current list is initially []
        //Thread 1 adds "Message 1"
        //Thread 2 adds "Message 2"
        // Excepted -> ["Message 1", "Message 2"]
        // if thread 1 finishes first the list will be ["Message 1"]
        // then thread 2 will update the whole list to ["Message 2"]
        // and "Message 1" will be lost
        synchronized(lock) {
            allMessages = allMessages.plus(message)
        }
    }

    fun onMessageDeliveryStateChanged(messageId: String, state: DeliveryState) {
        synchronized(lock) {
            allMessages = allMessages.map { message ->
                if (message.id == messageId)
                    message.copy(deliveryState = state)
                else message
            }
        }
    }
}