package week2

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

@Throws(IllegalArgumentException::class)
fun percentage(number: Int): Int =
        if (number in 0 .. 100) {
            number
        }
        else {
            throw IllegalArgumentException(
                    "A Percentage must be between 0 and 100: + $number"
            )
        }

fun parseNumber(num: String): Number = try {
    Integer.parseInt(num)
} catch (e: NumberFormatException) {
    0
}
