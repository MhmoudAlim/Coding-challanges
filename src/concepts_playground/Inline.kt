package concepts_playground

import kotlinx.coroutines.*
import javax.swing.tree.TreeNode


var foo: (() -> Unit)? = null

inline fun function(
    x: () -> Unit,
    crossinline y: () -> Unit,
    noinline z: () -> Unit
) {
    foo = {
        // leetcode_problems.easy.getX() // error
        y() // inlined
        z() // noinlined
    }
}


fun <T> TreeNode.findParentOfType(clazz: Class<T>): T? {
    var p = parent
    while (p != null && !clazz.isInstance(p)) {
        p = p.parent
    }

    return p as T
}

lateinit var str: String

fun main() {
    val handler = CoroutineExceptionHandler { _, exception ->
        println(exception)
    }
    val superJob = SupervisorJob()

    val scope = CoroutineScope(Job() + handler)
    scope.launch(superJob) {
        launch {}
        launch {
            throw Exception("m")
        }
    }

    var x = lazy { 2 }

    val z by lazy { 2 }

    x = lazy { 4 }




    println(x.value)
    println(z)

    if (::str.isInitialized.not())
        str = ""


}


