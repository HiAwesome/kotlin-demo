package com.moqi.kotlin.ch08.JoinToStringDefault

/**
 * 函数类型的参数默认值和 null 值 V1
 *
 * @author moqi On 12/8/20 15:49
 */
fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform: (T) -> String = { it.toString() }
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(transform(element))
    }

    result.append(postfix)
    return result.toString()
}

fun main() {
    val letters = listOf("Alpha", "Beta")
    println(letters.joinToString())
    println(letters.joinToString { it.toLowerCase() })
    println(letters.joinToString(separator = "! ", prefix = "! ", transform = { it.toUpperCase() }))
    println()
}
