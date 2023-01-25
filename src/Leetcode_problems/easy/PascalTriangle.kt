/*
Example 1:
Input: numRows = 5
Output:[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
 ]

 first list is always [1]
 second list is always [1,1]
 number[1] of each new list = 1
 number[2] of each new list = number[1] + number[2] of the previous list
 number[3] of each new list = number[2] + number[3] of the previous list
 number[4] of each new list = number[3] + number[4] of the previous list
 and so on ...

*/

fun pascalTriangle(numRows: Int): List<List<Int>> {

    if (numRows <= 0) return listOf()
    if (numRows > 30) return listOf()
    if (numRows == 1) return listOf(listOf(numRows))
    if (numRows == 2) return listOf(listOf(1),listOf(1, 1))

    val list = mutableListOf(listOf(1))
    for (i in 1 until numRows) {
        val listItem = mutableListOf(1)
        for (j in 1 until i)
            listItem.add(list[i - 1][j - 1] + list[i - 1][j])
        listItem.add(1)
        list.add(listItem)
    }
    return list
}


fun main() {
    println(pascalTriangle(1).toString())
}
