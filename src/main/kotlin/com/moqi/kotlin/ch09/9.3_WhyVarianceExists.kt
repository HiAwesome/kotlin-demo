package com.moqi.kotlin.ch09.WhyVarianceExists

import com.moqi.kotlin.ch03.joinToString

/**
 * 变型：范型和子类型化
 *
 * @author moqi On 12/9/20 14:21
 */
fun printContents(list: List<Any>) {
    println(list.joinToString())
}

fun <T : R, R> copyDataV1(source: MutableList<T>, destination: MutableList<R>) {
    for (item in source) {
        destination.add(item)
    }
}

fun <T> copyDataV2(source: MutableList<out T>, destination: MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}

fun <T> copyDataV3(source: MutableList<T>, destination: MutableList<in T>) {
    for (item in source) {
        destination.add(item)
    }
}

fun printFirst(list: List<*>) {
    if (list.isNotEmpty()) {
        println(list.first())
    }
}

fun <T> printFirstV2(list: List<T>) {
    if (list.isNotEmpty()) {
        println(list.first())
    }
}

fun main() {
    printContents(listOf("abc", "bca", "cba"))
    println()

    val ints = mutableListOf(1, 2, 3)
    val anyItems = mutableListOf<Any>()
    copyDataV1(ints, anyItems)
    println("anyItems = ${anyItems}")
    println()

    val anyItemsV2 = mutableListOf<Any>()
    copyDataV2(ints, anyItemsV2)
    println("anyItemsV2 = ${anyItemsV2}")
    println()

    val anyItemsV3 = mutableListOf<Any>()
    copyDataV3(ints, anyItemsV3)
    println("anyItemsV3 = ${anyItemsV3}")
    println()

    val list = listOf("Svetlana", "Dmitry")
    printFirst(list)
    println()

    printFirstV2(list)
    println()
}
