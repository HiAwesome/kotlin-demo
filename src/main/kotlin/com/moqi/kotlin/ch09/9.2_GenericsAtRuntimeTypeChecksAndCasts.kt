package com.moqi.kotlin.ch09.GenericsAtRuntimeTypeChecksAndCasts

/**
 * 运行时的范型：擦除和实化类型参数
 *
 * @author moqi On 12/9/20 11:20
 */
fun printSum(c: Collection<*>) {
    // val intList = c as? List<Int> ?: throw IllegalArgumentException("List is expected")
    val intList = c as? List<Int> ?: throw IllegalArgumentException("List is expected")
    println("intList.sum() = ${intList.sum()}")
}

fun printSum2(c: Collection<Int>) {
    if (c is List<Int>) {
        println("c.sum() = ${c.sum()}")
    }
}

inline fun <reified T> isA(value: Any) = value is T

fun main() {
    printSum(listOf(1, 2, 3))
    println()

    printSum2(listOf(1, 2, 3))
    println()

    println("isA<String>(\"abc\") = ${isA<String>("abc")}")
    println("isA<String>(123) = ${isA<String>(123)}")
    println()

    val items = listOf("one", 2, "three")
    println("items.filterIsInstance<String>() = ${items.filterIsInstance<String>()}")
    println()
}
