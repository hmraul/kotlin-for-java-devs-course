package week2

fun isLetter( c: Char) = c in 'a' .. 'z' || c in 'A' .. 'Z'

fun loop( l: Int) { for (i in 1 .. l) { println(l) } }

fun recognize(c: Char) = when (c) {
    in '0' .. '9' -> "It's a digit"
    in 'a' .. 'z', in 'A' .. 'Z' -> "It's a char"
    else -> "Another thing"
}

println("Kotlin" in "Java".."Scala") // true
println("Kotlin" in setOf("Java", "Scala")) // false