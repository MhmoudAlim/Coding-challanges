package concepts_playground

fun main() {
    val list = mapOf<String, Int>()
        .plus(Pair("A" , 1))
        .plus(Pair("B", 2))
        .plus(Pair("C", 3))

    println(filterOutProperties(list ,  "A" ))
    println(filterOutProperties(list ,  "B" ))
    println(filterOutProperties(list ,  *arrayOf("B" , "D")  ))

}

private fun filterOutProperties(
    attributes: Map<String, Any>,
    vararg property: String
): Map<String, Any> {
    property.forEach {
        attributes.filterNot { map ->
            map.key == it
        }
    }
    return attributes
}


