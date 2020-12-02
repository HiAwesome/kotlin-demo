package com.moqi.kotlin.ch03

/**
 * 让函数更好调用
 *
 * @author moqi On 12/2/20 17:34
 */
fun <T> joinToString(
    collection: Collection<T>,
    // 默认参数值
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}


fun main() {
    val list = listOf(1, 2, 3)
    // 触发 toString 的调用
    println("list = ${list}")
    println()

    println(joinToString(list, "; ", "(", ")"))
    println()

    // 命名参数
    println(joinToString(list, separator = "; ", "(", ")"))
    println(joinToString(list, separator = "; ", prefix = "(", ")"))
    println(joinToString(list, separator = "; ", prefix = "(", postfix = ")"))
    println(joinToString(list, prefix = "(", postfix = ")", separator = "; "))
    println()

    println(joinToString(list, "; "))
    println(joinToString(list, separator = "; ", prefix = "# "))
}
