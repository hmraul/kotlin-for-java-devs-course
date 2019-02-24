package week2

// fun String.lastChar() = this[this.length -1]

fun String.lastChar() = get(length - 1)

// How to call it from java

// -- import static Extensions.kt.lastChar;
// -- char c = lastChar("abc");