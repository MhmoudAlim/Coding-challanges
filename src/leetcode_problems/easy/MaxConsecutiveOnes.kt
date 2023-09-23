package leetcode_problems.easy

//https://leetcode.com/problems/max-consecutive-ones/

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var max = 0
    var counter = 0
    nums.forEach {
        when (it) {
            1 -> counter++
            else -> {
                max = Math.max(counter, max)
                counter = 0
            }
        }
    }

    return Math.max(counter, max)
}


fun main() {
    val result = findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 1, 1, 1))
    println(result)
}