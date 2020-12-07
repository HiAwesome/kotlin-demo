package com.moqi.kotlin.ch06.KotlinCollectionsAndJava1

import com.moqi.java.ch06.CollectionUtils

/**
 * Kotlin 调用 Java CollectionUtils
 *
 * @author moqi On 12/7/20 14:50
 */
fun printInUppercase(list: List<String>) {
    println(CollectionUtils.uppercaseAll(list))
    println(list.first())
}

fun main() {
    val list = listOf("a", "b", "c")
    printInUppercase(list)
}
