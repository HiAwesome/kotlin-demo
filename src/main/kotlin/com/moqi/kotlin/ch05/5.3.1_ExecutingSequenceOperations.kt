package com.moqi.kotlin.ch05.ex3_1_2_ExecutingSequenceOperations1

/**
 * 惰性操作集合：序列
 *
 * @author moqi On 12/4/20 17:17
 */
fun main() {
    val list = listOf(1, 2, 3, 4)

    list.asSequence()
        .map { print("map($it) "); it * it }
        .filter { print("filter($it) "); it % 2 == 0 }
    println()

    val list2 = list.asSequence()
        .map { print("map($it) "); it * it }
        .filter { print("filter($it) "); it % 2 == 0 }
        .toList()
    println()

    println("list2 = ${list2}")
    println()
}
