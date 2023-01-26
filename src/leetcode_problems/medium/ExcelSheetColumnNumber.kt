package leetcode_problems.medium//https://leetcode.com/problems/excel-sheet-column-number/submissions/
//
// So, how 17 is represented ?
//1 * 10 (10th place) + 7 * 1 (Unit's place) = 17
//How 1223 is represented ?
//1 * 1000 (10^3 place) + 2 * 100 (10^2 place) + 2 * 10 (10th place) + 3 * 1 (Unit's place) = 1223.
//
//Now apply the same principle for A....Z mapping to 1 to 26.
//How AB is represented ?
//A * 26 (26th place) + B * 1 (Unit's place) --> 1 * 26 + 2 * 1 = 28
//How ZY is represented ?
//Z * 26 + Y * 1 --> 26 * 26 + 25 * 1 = 701

fun titleToNumber(columnTitle: String): Int {
    if (columnTitle.isBlank()) return 0
    val base = 26
    var result = 0  //result*26 + (ASSCi Code)
    for (char in columnTitle) {
        if (char.isLowerCase())
            throw UnsupportedOperationException()
        result = (result * base) + (char - 'A') + 1
    }
    return result
}

fun main() {
    println(titleToNumber("AA"))
}