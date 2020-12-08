package com.moqi.kotlin.ch08.CallingFunctionsPassedAsArguments

/**
 * 调用作为参数的函数
 *
 * @author moqi On 12/8/20 15:26
 */
fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("result = ${result}")
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()

    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) sb.append(element)
    }

    return sb.toString()
}

fun main() {
    twoAndThree { a, b -> a + b }
    twoAndThree { a, b -> a * b }
    println()

    println("abcd23njkjansdf9nkjnsdf89238".filter { it in 'a'..'z' })
    println()
}
