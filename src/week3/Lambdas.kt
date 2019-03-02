package week3

// Always in curly braces
// {x: Int, Y: Int -> x + y}

fun functionWithLambdas() {
    val s: List<Int> = listOf(1, 2, 3)

    s.any({i: Int -> i > 0})
    s.any() {i: Int -> i > 0}
    s.any {i: Int -> i > 0}
    s.any {i -> i > 0}
    s.any {it > 0}

    s.any {
        println()
        it > 0 // Last expression is the result
    }
}

fun functionWithDestructuringDeclaration() {
    // Giving a foreach of a map(for example)
    val map: Map<Int, Int> = mapOf(Pair(1, 2), Pair(3, 4))

    map.mapValues { entry -> "${entry.key} -> ${entry.value}" }
    map.mapValues { (key, value) -> "$key -> $value" }
    //Only use of value
    map.mapValues { (_, value) -> "$value" }


}