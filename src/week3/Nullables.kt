package week3

fun Some(): String {
    val neverNull : String = "a String never is null"
    val canBeNull : String? = null

    if (neverNull == null) { // Compiler warns about a String never is null
        return "WTF! Can't be null"
    }

    if(canBeNull != null) {
        if (canBeNull.length > 0)
        return "canBeNull lenght is not null compared"
    }

    if (canBeNull?.length != null && canBeNull.isNotEmpty()) {
        return "Comparing direcly"
    }

    return "End Nullables"
}