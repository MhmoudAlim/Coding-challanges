package Concepts_playground

import kotlin.reflect.jvm.jvmName

class Reflection()

fun main() {

    val ref = Reflection()
    println("ref : $ref")


    val ref2 = Reflection::class.jvmName
    println("ref2 : $ref2")

    val ref3 = Reflection::class.java
    println("ref3 : $ref3")
}