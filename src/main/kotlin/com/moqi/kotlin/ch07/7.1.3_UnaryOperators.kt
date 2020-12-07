package com.moqi.kotlin.ch07.UnaryOperators

import java.math.BigDecimal

/**
 * 重载一元运算符
 *
 * @author moqi On 12/7/20 15:58
 */
data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main() {
    val p = Point(10, 20)
    println("-p = ${-p}")
    println()

    var bd = BigDecimal.ZERO
    // 后缀运算 ++ 先返回 bd 变量当前值，然后执行 ++，和前缀运算相反
    println("bd++ = ${bd++}")
    println("++bd = ${++bd}")
    println()
}
