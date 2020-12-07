package com.moqi.kotlin.ch07

/**
 * 重载二元算术运算符
 *
 * @author moqi On 12/7/20 15:25
 */
data class Point1(val x: Int, val y: Int) {
    operator fun plus(other: Point1): Point1 {
        return Point1(x + other.x, y + other.y)
    }
}

data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main() {
    val p1 = Point1(10, 20)
    val p2 = Point1(30, 40)
    println("p1 + p2 = ${p1 + p2}")
    println()

    val p3 = Point(10, 20)
    val p4 = Point(30, 40)
    println("p3 + p4 = ${p3 + p4}")
    println()

    val p5 = Point(10, 20)
    println("p5 * 1.5 = ${p5 * 1.5}")
    println()

    println("'a' * 10 = ${'a' * 10}")
    println()

    println(0x0F and 0xF0)
    println(0x0F or 0xF0)
    println(0x1 shl 4)
    println()
}
