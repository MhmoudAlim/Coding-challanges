package leetcode_problems.easy

import java.lang.Exception
import java.util.HashMap
import kotlin.math.abs


fun twoSum(nums: IntArray, target: Int): IntArray {
//    var ans = intArrayOf()
//    val map = mutableMapOf<Int, Int>()
//    for (i in nums.indices) {
//        if (map.contains(nums[i])) {
//            ans = map[nums[i]]?.let { intArrayOf(it, i) }!!
//            break
//        } else {
//            map[target - nums[i]] = i
//        }
//    }
//    return ans


//    //solution 2
//    nums.forEach {i ->
//        val list = nums.toMutableList()
//        list.remove(i)
//        list.forEach {j ->
//            if (i + j == target) return intArrayOf(nums.indexOf(i) ,nums.indexOf(j) )
//        }
//    }
//    throw Exception("Not Found")



//    var l = 0
//    var r = nums.size - 1
//    val list = nums.sorted()
//    // [2,3,4]
//    list.forEach {
//        val middle = abs(r - l) / 2
//        if (list[l] + list[middle] == target) return intArrayOf(l, middle)
//        else if (list[l] + list[middle] > target)
//            r--
//        else{
//            l = nums.size / 2
//            r = nums.size -1
//        }
//    }
//    throw Exception("Not found")
//
    //Solution 3
//    val map = HashMap<Int, Int>()
//    nums.forEachIndexed { i , num ->
//        val diff = target - num
//        if (map. containsKey(diff))
//            return intArrayOf(map[diff]!! , i)
//
//        map[num] = i
//
//    }

    return intArrayOf()


}

fun main() {
    val ans = twoSum(intArrayOf(3, 2, 4), 6)
    println(ans.asList().toString())
}