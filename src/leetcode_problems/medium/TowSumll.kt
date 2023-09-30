package leetcode_problems.medium

import java.lang.Exception

fun twoSum(numbers: IntArray, target: Int): IntArray {

    //Solution 1
//    val hashMap = HashMap<Int, Int>()
//    numbers.forEachIndexed { i, num ->
//        val diff = target - num
//        if (hashMap.containsKey(diff))
//           return intArrayOf(hashMap[diff]!! +1 , i +1)
//    }
//
//    throw Exception("not found")


    // solution 2
    return solution2(numbers, target)

}

private fun solution2(numbers: IntArray, target: Int): IntArray {
    var l = 0
    var r = numbers.size - 1

    while (l < r) {
        val sum = numbers[l] + numbers[r]
        if (sum < target) {
            l++
        } else if (sum > target) {
            r--
        } else {
            return intArrayOf(l + 1, r + 1)
        }
    }

    return intArrayOf(-1, -1)
}

// diff = 7
// [( 2,0 ) , (7 ,1 ) ,  ( , )]

fun main() {
    val ans = twoSum(numbers = intArrayOf(-1, 0), target = -1)
    println(ans.contentToString())
}