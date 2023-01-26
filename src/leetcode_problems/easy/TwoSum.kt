package leetcode_problems.easy

fun twoSum(nums: IntArray, target: Int): IntArray {
    var ans = intArrayOf()
    val map = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        if (map.contains(nums[i])) {
            ans = map[nums[i]]?.let { intArrayOf(it, i) }!!
            break
        } else {
            map[target - nums[i]] = i
        }
    }
    return ans
}

fun main() {
    val ans = twoSum(intArrayOf(3, 2, 4), 6)
    println(ans.asList().toString())
}