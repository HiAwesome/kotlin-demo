package com.moqi.kotlin.ch06.ReadonlyAndMutableCollections

/**
 * 只读集合与可变集合
 *
 * @author moqi On 12/7/20 14:28
 */
fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
    for (item in source) {
        target.add(item)
    }
}

fun main() {
    val source: Collection<Int> = arrayListOf(3, 5, 7)
    val target: MutableCollection<Int> = arrayListOf(1)
    copyElements(source, target)
    println("target = ${target}")
}
