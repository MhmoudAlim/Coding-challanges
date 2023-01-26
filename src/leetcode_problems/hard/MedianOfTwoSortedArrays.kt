package leetcode_problems.hard


/*
https://leetcode.com/problems/median-of-two-sorted-arrays/
*/

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val maxNumSize  = 1000 ; val maxAllNumsSize  = 2000

    // Lengths of two arrays
    val m = nums1.size
    val n = nums2.size
    val allNums = nums1.plus(nums2).sorted()

   // eliminate constraints
    if (m > maxNumSize) throw IllegalArgumentException("nums1 can't be larger than $maxNumSize")
    if (n > maxNumSize) throw IllegalArgumentException("nums2 can't be larger than $maxNumSize")
    if (allNums.size > maxAllNumsSize) throw IllegalArgumentException("nums1 + nums2 can't be larger than $maxAllNumsSize together")
    if (allNums.size == 1) return allNums[0].toDouble()

    // Check if num1 is smaller than num2
    // If not, then we will swap num1 with num2
    if (nums1.size > nums2.size) {
        return findMedianSortedArrays(nums2, nums1)
    }

    // Pointers for binary search
    var start = 0
    var end = m
    // Binary search starts from here
    while (start <= end) {
        // Partitions of both the array
        val partitionNums1 = (start + end) / 2
        val partitionNums2 = (m + n + 1) / 2 - partitionNums1
        // Edge cases
        // If there are no elements left on the left side after partition
        val maxLeftNums1 = if (partitionNums1 == 0) Int.MIN_VALUE else nums1[partitionNums1 - 1]
        // If there are no elements left on the right side after partition
        val minRightNums1 = if (partitionNums1 == m) Int.MAX_VALUE else nums1[partitionNums1]
        // Similarly for nums2
        val maxLeftNums2 = if (partitionNums2 == 0) Int.MIN_VALUE else nums2[partitionNums2 - 1]
        val minRightNums2 = if (partitionNums2 == n) Int.MAX_VALUE else nums2[partitionNums2]
        // Check if we have found the match
        if (maxLeftNums1 <= minRightNums2 && maxLeftNums2 <= minRightNums1) {
            // Check if the combined array is of even/odd length
            return if ((m + n) % 2 == 0) {
                (maxLeftNums1.coerceAtLeast(maxLeftNums2) + minRightNums1.coerceAtMost(minRightNums2)) / 2.0
            } else {
                maxLeftNums1.coerceAtLeast(maxLeftNums2).toDouble()
            }
        } else if (maxLeftNums1 > minRightNums2) {
            end = partitionNums1 - 1
        } else {
            start = partitionNums1 + 1
        }
    }
    throw IllegalArgumentException()
}


fun main(){
    val nums2 = arrayListOf<Int>()
     (1..1000).forEach {
        nums2.add(it)
    }
    val ans = findMedianSortedArrays(intArrayOf() , intArrayOf(1,2,3,4,5))
    println(ans)
}