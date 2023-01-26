package concepts_playground

import kotlin.properties.Delegates

@DslMarker
annotation class SuperMobile


interface Device

 open class Mobile: Device {
    fun ring() {
        println("ring ring")
    }
}

@SuperMobile
class Android : Mobile() {
    fun multiTask() {
        println("I can multi-task")
    }
}

fun buildMobile(builder: Mobile.() -> Unit): Mobile {
    return Mobile().apply(builder)
}

fun buildAndroid(builder: Android.() -> Unit): Mobile {
    return Android().apply(builder)
}


fun main() {
    buildAndroid {
        ring()
        multiTask()
    }

}


class Newsletter {
    val newestArticleObservers = mutableListOf<(String) -> Unit>()

    var newestArticleUrl: String by Delegates.observable("") { _, _, newValue ->
        newestArticleObservers.forEach {
            it(newValue)
        }
    }
    fun observe() {
        val newsletter = Newsletter()
        newsletter.newestArticleObservers.add { newestArticleUrl ->
            println("New Baeldung article: ${newestArticleUrl}")
        }
    }
}



