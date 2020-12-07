package com.moqi.kotlin.ch07.CompoundAssignmentOperators

/**
 * 重载复合赋值运算符
 *
 * @author moqi On 12/7/20 15:47
 */
data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

fun main() {
    var point = Point(1, 2)
    point += Point(3, 4)
    println("point = ${point}")
    println()

    val numbers = ArrayList<Int>()
    numbers += 42
    println("numbers[0] = ${numbers[0]}")
    println()

    val list = arrayListOf(1, 2)
    list += 3
    val newList = list + listOf(4, 5)
    println("list = ${list}")
    println("newList = ${newList}")
    println()
}
