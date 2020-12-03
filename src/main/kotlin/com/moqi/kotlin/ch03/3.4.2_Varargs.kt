package com.moqi.kotlin.ch03

/**
 * 可变参数：让函数支持任意数量的参数
 *
 * @author moqi On 12/3/20 10:49
 */
val list1: Array<Int> = arrayOf(2, 3, 5, 7, 22)

fun main() {
    // 解包
    val l1 = listOf(100, *list1)
    println("l1 = ${l1}")
}
