// We define JvmName for calling directly in java as Static methods / functions
@file:JvmName("Math")
package week2

fun max(a:Int, b:Int): Int {
    return if (a > b) a else b
}

fun maxInline(a:Int, b:Int): Int = if (a > b ) a else b

fun maxInlineShort(a:Int, b:Int) = if (a > b ) a else b