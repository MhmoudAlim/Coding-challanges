package leetcode_problems.medium

import java.lang.Exception

fun twoSum(numbers: IntArray, target: Int): IntArray {

    val hashMap = HashMap<Int, Int>()
    numbers.forEachIndexed { i, num ->
        val diff = target - num
        if (hashMap.containsKey(diff))
           return intArrayOf(hashMap[diff]!! +1 , i +1)


    }

    throw Exception("not found")

}

// diff = 7
// [( 2,0 ) , (7 ,1 ) ,  ( , )]

fun main() {
    val ans = twoSum(numbers = intArrayOf(-1,0), target = -1)
    println(ans.contentToString())
}