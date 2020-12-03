package com.moqi.kotlin.ch03

/**
 * joinToString 的终极版本
 *
 * @author moqi On 12/3/20 10:10
 */
fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToString(separator, prefix, postfix)

fun main() {
    println(listOf("one", "two", "eight").join(" "))
    println(listOf(1, 2, 3).joinToString(" "))
}
