package Leetcode_problems

/*
https://leetcode.com/problems/palindrome-number/
Given an integer x, return true if x is a palindrome, and false otherwise.
*/


fun main() {
    val ans = isPalindrome(122)
    println(ans)
}


fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    // Store the number in a variable
    var number = x
    // This will store the reverse of the number
    var reverse = 0
    while (number > 0) {
        reverse = reverse * 10 + number % 10
        number /= 10
    }
    return x == reverse
}
