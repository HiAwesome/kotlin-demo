package com.moqi.kotlin.ch07.IndexOperator

/**
 * 通过下标来访问元素
 *
 * @author moqi On 12/7/20 16:19
 */
data class Point(val x: Int, val y: Int)

operator fun Point.get(index: Int): Int {
    return when (index) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) {
    when (index) {
        0 -> x = value
        1 -> y = value
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

fun main() {
    val p = Point(10, 20)
    println("p[1] = ${p[1]}")
    println()

    val mp = MutablePoint(10, 20)
    mp[1] = 42
    println("mp = ${mp}")
    println()
}
