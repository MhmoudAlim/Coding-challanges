package leetcode_problems.medium


// https://leetcode.com/problems/product-of-array-except-self/

/*
Example 1:
-Input: nums = [1,2,3,4]
=Output: [24,12,8,6]

Example 2:
-Input: nums = [-1,1,0,-3,3]
=Output: [0,0,9,0,0]
*/


fun productExceptSelf(nums: IntArray): IntArray {
    val ans = IntArray(nums.size)
    var prefix = 1

    for (i in nums.indices) {
        ans[i] = prefix
        prefix = prefix * nums[i]
    }

    var postfix = 1
    for (i in nums.size - 1 downTo 0) {
        ans[i] = ans[i] * postfix
        postfix = postfix * nums[i]
    }
    return ans
}


fun main() {
    val ans = productExceptSelf(intArrayOf(1, 2, 3, 4))
    println(ans.contentToString())
}