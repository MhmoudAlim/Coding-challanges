package concepts_playground

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(){
    delayOne()
    delayTwo()
}

private fun delayOne() = runBlocking{
    val totalTime = measureTimeMillis {
        val delay1 = addDelay(1000L)
        val delay2 =addDelay(500L)
        println("delayOne Total time taken: ${delay1 + delay2} ms")
    }
    println("delayOne totalTime = $totalTime")
    println("delayOne Done")
}

private fun delayTwo() = runBlocking {
    val totalTime = measureTimeMillis {
        val delay1 = async { addDelay(1000L) }
        val delay2 = async { addDelay(500L) }
        val result1 = delay1.await()
        val result2 = delay2.await()
        println("delayTwo Total time taken: ${result1 + result2} ms")
    }
    println("delayTwo totalTime = $totalTime")
    println("delayTwo Done")
}


private suspend fun addDelay(delayTime: Long):Long{
    delay(delayTime)
    return delayTime
}
