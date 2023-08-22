package concepts_playground

import java.io.File
import java.util.*
import kotlin.properties.Delegates

fun main(){
    println(string("Outlander" , query = "lan"))

    data class Car(val name: String = "z")

    var car by Delegates.notNull<Int>()

    

    val y by lazy {
        10
    }

    y.and(2)

}


fun string(title: String, query: String): String {
    title.contains(query, true)

    val prefix = title.prefix(query)
    val postfix = title.postfix(query)

val query = title.removeSurrounding(prefix = title.prefix(query) , suffix = title.postfix(query))

    return "$prefix${query}$postfix"
}

fun String.postfix(query: String): String {
    val index = indexOf(query, ignoreCase = true)
    return if (index == -1) this
    else substring(index + query.length, length)
}

fun String.prefix(query: String): String {
    val index = indexOf(query, ignoreCase = true)
    return if (index == -1) this
    else substring(0, index)
}

fun String.capitalize(): String {
    if (this.isEmpty()) return this
    if (this.prefix(" ") != "") return this
    return this.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
}

