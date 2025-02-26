package concepts_playground

import kotlinx.coroutines.*

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    runBlocking {
        launch(Dispatchers.IO) {
            val currentDispatcher = coroutineContext[CoroutineDispatcher]
            println("Hello, ${Thread.currentThread().name}")
            println("---")
            println("${currentCoroutineContext()}")
            println("---")
            println("${currentDispatcher}")

        }
    }
}
