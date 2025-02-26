package concepts_playground

class User {
    // DON'T DO THAT
    var name: String = ""
        // Using property name inside getter
        // leads to infinite recursion
        get() = name.uppercase()
}

fun main() {
    val user = User()
    user.name = "norbert"
    println(user.name)
}
