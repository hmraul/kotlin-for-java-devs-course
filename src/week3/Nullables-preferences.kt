package week3

fun SomeOperations(): String {
    val x: Int? = 1
    val y:Int = 2

    var sum = x ?: 0 + y
    println (sum) // The result is 1, due to operator precedence
    // Without parenthesis sum the same as
    sum = x?: (0 + y)

    // We should add parenthesis in condition to raise precedence
    sum = (x ?: 0) + y

    return "Operator precendences"
}