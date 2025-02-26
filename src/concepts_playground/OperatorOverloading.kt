package concepts_playground
fun main() {
    val name = "Name"
    val name_ = "name"

    println(name == name_)
    println(name.equals( name_))
    println(name.equals( name_ , true))

    2(2)


}


private operator fun Int.invoke(i: Int) {
    this * this
}