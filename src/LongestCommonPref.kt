//https://leetcode.com/problems/longest-common-prefix/

//best
fun longestCommonPrefix(strs: Array<String>?): String {
    if (strs == null || strs.isEmpty()) return ""
    for (i in 0 until strs[0].length) {
        val c = strs[0][i]
        for (j in 1 until strs.size) {
            if (i == strs[j].length || strs[j][i] != c) return strs[0].substring(0, i)
        }
    }
    return strs[0]
}

fun longestCommonPrefix1(strs: Array<String>): String {
    println(strs.contentToString())
    if (strs.isEmpty()) return ""
    if (strs.size == 1) return strs[0]
    val firstItem = strs[0]
    for (i in firstItem.indices) {
        strs.forEach {
            if (firstItem[i] != it[i])
                return firstItem.substring(0, i)
        }
    }
    return ""
}


fun longestCommonPrefix2(strs: Array<String>): String {
    println(strs.contentToString())
    return if (strs.isNotEmpty()) strs.reduce { accumulator, string ->
        accumulator.commonPrefixWith(string)
    } else ""
}

fun main() {
    val strs = arrayOf("flower", "fla", "flight", "fl")
    val strs2 = arrayOf("flower", "fla", "asd", "fl")
    val strs3 = arrayOf("a", "ab")
    println(longestCommonPrefix(strs))


}