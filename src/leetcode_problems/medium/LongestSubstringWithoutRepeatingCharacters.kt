package leetcode_problems.medium

/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/


fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()) throw IllegalArgumentException("string length must be greater than 0")
    if (s.length > 50000) throw IllegalArgumentException("string length must be less than 50000")
    var max = 0
    val hashSet = LinkedHashSet<Char>()

    s.forEach{
        while (hashSet.contains(it)){
            if (max < hashSet.size) max = hashSet.size
            hashSet.remove(hashSet.first())
        }
        hashSet.add(it)
    }
    if(max < hashSet.size) {
        max = hashSet.size
    }
    return max
}

fun main() {
    val ans = lengthOfLongestSubstring("abscsb")
    println(ans)
}