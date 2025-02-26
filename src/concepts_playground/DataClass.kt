package concepts_playground

data class Player(
    val id: Int,
    val name: String,
    val points: Int
)

class Player2(
    val id: Int,
    val name: String,
    val points: Int
)

fun main() {
    println(Player(0, "Gecko", 9999).hashCode()) // 2129010918
    println(Player(0, "Gecko", 9999).hashCode()) // 2129010918
    println(Player(0, "Ross", 9999).hashCode()) // 79159602

    println(Player2(0, "Gecko", 9999).hashCode()) // 295530567
    println(Player2(0, "Gecko", 9999).hashCode()) // 2003749087
    println(Player2(0, "Ross", 9999).hashCode()) // 1324119927

    val user = Use("Mah", "-")
    println(user)

    val users = listOf(
        Use("Nicola", "Corti")
    )

    users.forEach { u -> println(u) }        // User(name=Nicola, surname=Corti)
    users.forEach { (u) -> println(u) }      // Nicola
}


data class Use(
    val name: String,
    var surname: String,
) {
    init {
        require(name.isNotBlank())       // throws exception if name is blank
        require(surname.isNotBlank())     // throws exception if surname is blank
    }
}




