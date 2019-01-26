package week2

// for Loops
fun something() {
    val list = listOf("a", "b", "c")
    for (s in list) {
        print(s)
    }

    val map = mapOf(
            1 to "one",
            2 to "two",
            3 to "three"
            )
    for ((num, description) in map) {
        println("$num = $description")
    }

    for (i in 1..9) {
        print(i)
    }

    for (i in 1 until 10) {
        print(i)
    }
}
