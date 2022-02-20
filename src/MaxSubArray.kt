fun maxSubArray(nums: IntArray): Int {
    var maxGlobal = nums[0]
    var maxCurrent = nums[0]
    for (i in 1 until nums.size) {
        maxCurrent = nums[i].coerceAtLeast(maxCurrent + nums[i])
        maxGlobal = maxCurrent.coerceAtLeast(maxGlobal)
    }
    return (maxGlobal)

}


fun main() {
    val numbers = intArrayOf(-2, -1)
    val answer = maxSubArray(numbers)
    println(answer)
}
