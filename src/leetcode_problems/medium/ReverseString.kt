package leetcode_problems.medium

fun reverseString(): String {
    val string = "ReverseMePlease"
    var resultString = ""
    var lastindex = string.lastIndex
    while (lastindex >= 0) {
        resultString = "$resultString${string[lastindex]}"
        lastindex--
    }
    return resultString
}

fun main() {
    println(reverseString())
}