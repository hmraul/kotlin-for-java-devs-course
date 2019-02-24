package week2

fun isValidIdentifier(s: String): Boolean {
    var isDigit = true
    var isValidChar = true

    for (c: Char in s) {
        isDigit = isDigit && c in '0'.. '9'
        isValidChar = (c == '_' || c in '0'.. '9' || c in 'a'.. 'z' || c in 'A'.. 'Z')
    }

    return isValidChar && !isDigit
}



fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}