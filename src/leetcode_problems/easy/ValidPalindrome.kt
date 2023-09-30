package leetcode_problems.easy


//https://leetcode.com/problems/valid-palindrome/
fun isPalindrome(s: String): Boolean {
    if (s.isEmpty()) return true

    val rgx = Regex("[^A-Za-z]")
    val new = rgx.replace(s, "").toLowerCase()
    println(new)


    return new == new.reversed()
}


fun main() {
    val ans = isPalindrome("A man, a plan, a canal: Panama")
    println(ans)
}