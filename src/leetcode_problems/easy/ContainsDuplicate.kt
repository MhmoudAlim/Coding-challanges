fun containsDuplicate(nums: IntArray): Boolean {
    // Naive solution
//    return nums.distinct().size < nums.size

    //solution 2
//    nums.forEach{
//        val newList = nums.toMutableList().also {list ->  list.remove(it) }
//        if (newList.contains(it)) return true
//    }
//    return false


    //solution 3
    val hs = mutableSetOf<Int>()
    nums.forEach {
        if (hs.add(it).not()) return true
    }
    return false

}




fun main() {
   val ans = containsDuplicate(nums = intArrayOf(1,2,3,1))
    println(ans.toString())
}