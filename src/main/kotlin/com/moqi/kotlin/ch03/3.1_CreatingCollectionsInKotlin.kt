package com.moqi.kotlin.ch03

/**
 * 在 Kotlin 中创建集合
 *
 * @author moqi On 12/2/20 17:28
 */
val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

fun main() {
    println("set.javaClass = ${set.javaClass}")
    println("list.javaClass = ${list.javaClass}")
    println("map.javaClass = ${map.javaClass}")
    println()

    val strings = listOf("first", "second", "fourteenth")
    println("strings.last() = ${strings.last()}")
    val numbers = setOf(1, 14, 88)
    println("numbers.maxOrNull() = ${numbers.maxOrNull()}")
    println()
}
