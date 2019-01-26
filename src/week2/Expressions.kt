package week2

// No ternary operator

val a = 1
val b = 2

val max = if (a > b) a else b

enum class Color {
    BLUE, ORANGE, RED
}


// Switch to When
fun getDescription(color: Color): String =
        when (color) {
            Color.BLUE -> "cold"
            Color.ORANGE -> "warm"
            Color.RED -> "Hot"
        }

fun WhenSyntax(a: Any) = when (a) {
    0 -> "Is zero"
    is Int -> "Is Integer"
    is String -> "Is a string"
    else -> "Other Type"
}

fun updateWeather (degrees: Int) {
    val(description, color) = when {
        degrees < 15 -> "cold" to Color.BLUE
        degrees < 25 -> "warm" to Color.ORANGE
        else -> "hot" to Color.RED
    }
}