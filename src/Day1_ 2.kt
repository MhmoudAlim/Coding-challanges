fun containsDuplicate(nums: IntArray): Boolean {

    return nums.distinct().size < nums.size
}

fun maxSsubArray(nums: IntArray): Int {

    return 0
}

fun main() {
   val ans = containsDuplicate(nums = intArrayOf(1,2,3))
    println(ans.toString())

}