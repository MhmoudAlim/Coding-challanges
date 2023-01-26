package concepts_playground


fun main(){
    var z = 2
    println(z)

    z.also{
        println("filler")
        z = 6
    }

    println(z)
}
