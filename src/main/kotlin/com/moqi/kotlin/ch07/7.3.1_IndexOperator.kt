package com.moqi.kotlin.ch07.IndexOperator

import java.time.LocalDate

/**
 * 通过下标来访问元素
 * in、rangeTo、iterator 的约定
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

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

operator fun Rectangle.contains(p: Point): Boolean {
    return p.x in upperLeft.x until lowerRight.x &&
            p.y in upperLeft.y until lowerRight.y
}

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> {
        var current = start

        override fun hasNext(): Boolean =
            current <= endInclusive

        override fun next(): LocalDate = current.apply {
            current = plusDays(1)
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

    val rect = Rectangle(Point(10, 20), Point(50, 50))
    println("Point(20, 30) in rect = ${Point(20, 30) in rect}")
    println("Point(5, 5) in rect = ${Point(5, 5) in rect}")
    println()

    val n = 9
    println(0..(n + 1))
    (0..n).forEach { print(it) }
    println()
    println()

    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOffs = newYear.minusDays(10)..newYear
    for (day in daysOffs) {
        println("day = ${day}")
    }
}
