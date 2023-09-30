package concepts_playground

import kotlinx.coroutines.*
import kotlin.Exception

fun main() {

    CoroutineScope(Dispatchers.Default).launch {
        try {
            launch {
                delay(500L)
                throw Exception()
            }
        } catch (e: Exception) {
            println("Exception caught -> $e ")
        }
    }


    val deffered = CoroutineScope(Dispatchers.IO).async {
        async {
            delay(500L)
            throw Exception("error")
            "Result"
        }
    }
    CoroutineScope(Dispatchers.IO).launch {
        deffered.await()
    }

    CoroutineScope(Dispatchers.IO).async {
        val result = async {
            delay(500L)
            throw Exception("error")
            "Result"
        }
        println(result.await())
    }


    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        println("Exception caught -> $throwable ")

    }

    CoroutineScope(Dispatchers.Default + exceptionHandler).launch {
        launch {
            delay(500L)
            throw Exception("error")
        }

    }

    CoroutineScope(Dispatchers.Default + exceptionHandler).launch {
        launch {
            delay(300L)
            throw Exception("Coroutine 1 failed")
        }
        launch {
            delay(600L)
            println("Coroutine 2 finished")
        }
    }


    CoroutineScope(Dispatchers.Default + exceptionHandler).launch {
        supervisorScope {
            launch {
                delay(300L)
                throw Exception("Coroutine 1 failed")
            }
            launch {
                delay(600L)
                println("Coroutine 2 finished")
            }
        }
    }


    CoroutineScope(Dispatchers.Default + exceptionHandler).launch {
        supervisorScope {
            val job = launch {
                try {
                    delay(500L)
                } catch (e: java.lang.Exception) {
//                    if (e is CancelationException) throw e
                    e.printStackTrace()
                }
                println("Coroutine 1 finished")
            }
            delay(300L)
            job.cancel()
        }
    }


}



