package leetcode_problems.medium

import java.lang.Exception
import kotlin.math.abs


/*
https://www.geeksforgeeks.org/find-a-pair-with-the-given-difference/

Given an unsorted array and a number n,
find if there exists a pair of elements in the array whose difference is n.

Examples:

-Input: arr[] = {5, 20, 3, 2, 50, 80}, n = 78
=Output: Pair Found: (2, 80)

-Input: arr[] = {90, 70, 20, 80, 50}, n = 45
=Output: No Such Pair*/

fun findPair(nums: IntArray, n: Int): IntArray {
//    //<editor-fold desc = "Solution 1">
//    /*
//    Time Complexity: O(n*n) as two nested for loops are executing both from 1 to n where n is size of input array.
//    Space Complexity: O(1) as no extra space has been taken
//    */
//
//    nums.forEach { i ->
//        for (j in i + 1 until nums.size) {
//            if (abs(nums[i] - nums[j]) == n) return intArrayOf(nums[i], nums[j])
//        }
//    }
//    throw Exception("no pair found")
//    //</editor-fold>

    //<editor-fold desc = "Solution 2">

    // Time Complexity: O(n*log(n))
    val sorted = nums.sorted()
    var p1 = 0
    var p2 = sorted.size - 1

    while (p2 >= p1 && p2 < sorted.size) {
        if (abs(sorted[p1] - sorted[p2]) == n && p1 != p2) {
            println("p1 = $p1")
            println("p2 = $p2")
            println("abs diff = ${abs(sorted[p1] - sorted[p2])}")
            return intArrayOf(sorted[p1], sorted[p2])
        } else {
            if (sorted[p1] - sorted[p2] > n) {
                println("p1 = $p1")
                println("p2 = $p2")
                println("n = $n")
                println("diff = ${sorted[p1] - sorted[p2]}")
                p1++
                println("p1++ = ${p1++}")
            } else {
                p2--
                println("p2-- = ${p2--}")

            }
        }
    }

    throw Exception("no pair found")
    //</editor-fold>
}


fun main() {
    val result = findPair(nums = intArrayOf(5, 20, 3, 2, 50, 80, 90, 83), n = 78)
    println(result.contentToString())

}
