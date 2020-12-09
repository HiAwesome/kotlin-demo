package com.moqi.kotlin.ch09.GenericFunctionsAndProperties

/**
 * 范型类型参数
 *
 * @author moqi On 12/9/20 10:39
 */
val <T> List<T>.penultimate: T
    get() = this[size - 2]

fun main() {
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))
    println(letters.slice(10..13))
    println()

    println("listOf(1, 2, 3, 4,).penultimate = ${listOf(1, 2, 3, 4).penultimate}")
    println()
}
