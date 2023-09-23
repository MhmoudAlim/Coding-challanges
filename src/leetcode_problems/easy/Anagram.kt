package leetcode_problems.easy

//https://leetcode.com/problems/valid-anagram/

fun isAnagram(s: String, t: String): Boolean {
    val ts = t.toMutableList()
    s.forEach{ i ->
        if (!ts.remove(i)) return false
    }
    return t.isBlank()
}

fun main(){
    val result = isAnagram("anagram" , "nagaram" )
    println(result)

}



