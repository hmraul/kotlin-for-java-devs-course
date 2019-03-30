package week3

val list: List<Int> = listOf(1, 0, 3)

fun duplicateNonZero(list : List<Int>): List<Int> {
    return list.flatMap {
        if (it == 0) return listOf()
        listOf(it, it)
    }
}

// code: println(duplicateNonZero(list))

// For the example above, it will return [] due to return refer always to a 'fun', so,
// it will return [] when a 0 is found

// If we want to return to lambda


fun duplicateNonZero2(list : List<Int>): List<Int> {
    return list.flatMap {
        if (it == 0) return@flatMap listOf<Int>()
        listOf(it, it)
    }
}

// or set a label name

fun duplicateNonZero3(list : List<Int>): List<Int> {
    return list.flatMap l@{
        if (it == 0) return@l listOf<Int>()
        listOf(it, it)
    }
}

// Also, you can solve this using
//      - Function references
//      - Anonymous functions

