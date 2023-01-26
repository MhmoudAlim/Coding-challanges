package concepts_playground
fun main() {
    2(2)
}


private operator fun Int.invoke(i: Int) {
    this * this
}