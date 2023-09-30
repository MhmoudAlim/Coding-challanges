package leetcode_problems.medium


/*
https://leetcode.com/problems/top-k-frequent-elements/
Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]

*/
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    if (nums.size == 1 && k == 1) return intArrayOf(1)
    val map = nums.toList().groupingBy { it }.eachCount()
    val freq = Array<MutableList<Int>>(nums.size+1){ mutableListOf() }
    map.forEach{ (k, v) ->
      freq[v].add(k)
    }
    return freq.flatMap { it }.takeLast(k).toIntArray()
}

fun main(){
   val ans = topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2)
    println(ans.toList().toString())
}