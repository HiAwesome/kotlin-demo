package com.moqi.kotlin.ch06

/**
 * 数字转换
 *
 * @author moqi On 12/7/20 11:35
 */
fun foo(l: Long) = println(l)
fun main() {
    val x = 1
    println("x.toLong() in listOf(1L, 2L, 3L) = ${x.toLong() in listOf(1L, 2L, 3L)}")
    println()

    val b: Byte = 1
    val l = b + 1L
    println("l = ${l}")
    foo(42)
    println()

    println("422".toInt())
    println()
}
