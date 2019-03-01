package week3

import kotlin.test.assertFalse
import kotlin.test.assertTrue


fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""

    assertTrue { s1.isEmptyOrNull() } //eq true
    assertTrue { s2.isEmptyOrNull() } //eq true

    val s3 = "   "
    assertFalse { s3.isEmptyOrNull()} //eq false
}

private fun String?.isEmptyOrNull(): Boolean {
    return (this?.length ?: 0) == 0
}
