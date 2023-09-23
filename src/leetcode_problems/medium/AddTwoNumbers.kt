package leetcode_problems.medium

/*
https://leetcode.com/problems/add-two-numbers/
*/

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 * Example 1:
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 *
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 *
 * Example 3:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */
/// 3(4(5))

class ListNode(var value: List<Int>)


fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode {
    val ls1 = StringBuilder()
    val ls2 = StringBuilder()
    val resultNode = mutableListOf<Int>()
    (l1?.value?.reversed() ?: listOf()).forEach { i ->
        ls1.append(i)
    }
    for (i in l2?.value?.reversed() ?: listOf()) {
        ls2.append(i)
    }
    val result = ls1.toString().toInt() + ls2.toString().toInt()
    result.toString().forEach {
        resultNode.add(it.digitToInt())
    }
    return ListNode(resultNode.reversed())
}

fun main() {
    val ans = addTwoNumbers(l1 = ListNode(listOf(9,9,9,9,9,9,9)), l2 = ListNode(listOf(9,9,9,9)))
    println(ans.value)
}


