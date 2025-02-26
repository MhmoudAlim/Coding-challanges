package concepts_playground

fun main() {
    val list = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )

    println(list)

    println(list.flatten()) // [1, 2, 3, 4, 5, 6, 7, 8, 9]

    list.flatMap { it ->
        it.map { it }
    }.also { println(it) }


}
