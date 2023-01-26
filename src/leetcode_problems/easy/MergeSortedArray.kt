package leetcode_problems.easy/*
nums1 = intArray()
nums2 = intArray() //  nums2.length = n
m = number of elements in nums1
n = number of elements in nums2

ans = nums1.length = m+n
m =  elements that should be merged / n last element = 0 and ignored


nums1 = [1,2,3,0,0,0] , m = 3,
nums2 = [2,5,6]       , n = 3
----------------
Output: [1,2,2,3,5,6]

 */


var x = intArrayOf()

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    var nums1LastItem = m - 1
    var nums2LastItem = n - 1
    for (i in (m + n - 1) downTo 0) {
        nums1[i] = when {
            nums2LastItem < 0 -> nums1[nums1LastItem--]
            nums1LastItem < 0 -> nums2[nums2LastItem--]
            nums1[nums1LastItem] > nums2[nums2LastItem] -> nums1[nums1LastItem--]
            else -> nums2[nums2LastItem--]
        }
        x = nums1
    }
}


fun main() {
    merge(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3)
    x.forEach(::print)
}