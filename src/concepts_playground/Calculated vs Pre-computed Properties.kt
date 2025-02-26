package concepts_playground

import java.util.Date

class User2 {
    var name: String = ""
    var surname: String = ""
    val fullName1: String
        get() = "$name $surname"     // Calculated on demand
    val fullName2: String = "$name $surname" // Pre-computed during object creation
}

fun main1() {
    val user = User2()
    user.name = "Maja"
    user.surname = "Markiewicz"
    println("fullName1 " + user.fullName1) // Maja Markiewicz
    println("fullName2 " + user.fullName2) // Maja Markiewicz
    user.surname = "Moskała"
    println("----")
    println("fullName1 " + user.fullName1) // Maja Moskała
    println("fullName2 " + user.fullName2) // Maja Markiewicz
}


class Holder {
    val v1: Int get() = calculate("v1")   // Calculated on demand
    val v2: Int = calculate("v2")        // Pre-computed during object creation

    private fun calculate(propertyName: String): Int {
        println("Calculating $propertyName")
        return 42
    }
}

fun mainr() {
    val h1 = Holder() // Calculating v2
    // h1 never used v1, so it was never calculated
    // v2 is calculated during object creation, even if not used

    val h2 = Holder() // Calculating v2
    println(h2.v1) // Calculating v1 and 42
    println(h2.v1) // Calculating v1 and 42
    println(h2.v2) // 42
    println(h2.v2) // 42
    // v1 is calculated every time it's accessed
    // v2 is calculated once during object creation
}



class DATE {
    // ...
    var birthdateMillis: Long? = null

    var birthdate: Date?
        get() {
            return birthdateMillis?.let(::Date)
        }
        set(value) {
            birthdateMillis = value?.time
        }
}

fun main(){
    val date = DATE()

    println(date.birthdateMillis)
    println(date.birthdate)
}


class Puppy(val name: String = "Unnamed"){
    inner  class  InnerPuppy
}
