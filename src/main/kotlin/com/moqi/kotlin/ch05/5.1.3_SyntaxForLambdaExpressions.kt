package com.moqi.kotlin.ch05

/**
 * Lambda 表达式的语法
 *
 * @author moqi On 12/4/20 16:13
 */
fun main() {
    val sum = {x: Int, y: Int -> x + y}
    println("sum(1, 2) = ${sum(1, 2)}")
    println()

    run { println(42) }
    println()

    val sum1 = {x: Int, y: Int ->
        println("Computing the sum of $x and $y...")
        x + y
    }
    println("sum1(10, 20) = ${sum1(10, 20)}")
    println()
}
