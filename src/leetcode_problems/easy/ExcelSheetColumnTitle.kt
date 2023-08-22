package leetcode_problems.easy

/*
https://leetcode.com/problems/excel-sheet-column-title/
*/

fun convertToTitle(columnNumber: Int): String {
    if (columnNumber < 1) throw IllegalArgumentException(" columnNumber must be equal or greater than 1 , current is $columnNumber")
    var columnValue = columnNumber
    val str = StringBuilder()
    while (columnValue-- > 0) {
        str.insert(0, 'A' + columnValue % 26)
        columnValue /= 26
    }
    return str.toString()
}


fun main() {
    println(convertToTitle(2))
}