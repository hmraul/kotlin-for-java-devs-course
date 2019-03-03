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

// Common operations on collections
// filter
// map
// any (all, none)
// find
// first
// firstOrNull
// count
// partition
//      listOf(1, 2, 3, 4).partition {it % 2 == 0} --> (2, 4) and (1, 3)
//      Return two the collection split in two parts
// groupBy
// associateBy
//      (Alice, 31)
//      (Bob, 29)
//      (Carol, 31)
//      mapOf((Alice, 31), (Bob, 29), (Carol, 31))
//      .associateBy {it.name} --> (Alice, 31), (Bob, 29), (Carol, 31)
// -----------------------------------------------------
//      mapOf((Alice, 31), (Bob, 29), (Carol, 31))
//      .associateBy {it.age} --> *remove duplicates*( (Bob, 29), (Carol, 31) )
// zip
// flatMap


