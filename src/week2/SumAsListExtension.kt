package week2

fun List<Int>.sum(): Int = this.reduce{acc, element -> acc + element}

fun main(args: Array<String>) {
    val sum = listOf(1, 2, 3).sum()
    println(sum)    // 6
}