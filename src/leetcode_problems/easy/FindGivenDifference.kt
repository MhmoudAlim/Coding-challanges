package leetcode_problems.easy

import kotlin.math.*


/*Given an unsorted array,
return 1 if there exists a pair or more of elements in the array whose difference is 1.
else return 0

Examples:

-Input: arr[] = {5, 20, 3, 2, 6}
=Output: 1

-Input: arr[] = {90, 7, 2, 9, 50}
=Output: 0
*/

fun findPairDifference(nums: IntArray): Int {
// O(N*N) Solution
//    nums.forEach { i ->
//        val list = nums.toMutableList()
//        list.remove(i)
//        list.forEach { j ->
//            if (abs(i - j) == 1)
//                return 1
//        }
//    }
//    return 0
    val sorted = nums.sorted()
     //                      [2, 7,  20, 21, 22]
    var l = 0           //2
    var r = nums.size -1 //22
    while (l >= r){
        val middle = (l + r) / 2  // 20
        if (abs(sorted[middle] - sorted[l]) == 1)
            return 1
        else if (abs(sorted[middle] - sorted[l]) < 1)
            r = middle -1
        else
            l = middle + 1
    }
    return 0
}

fun main() {
    val result = findPairDifference(nums = intArrayOf( 7, 2, 20, 22, 21))
    println(result.toString())

}
