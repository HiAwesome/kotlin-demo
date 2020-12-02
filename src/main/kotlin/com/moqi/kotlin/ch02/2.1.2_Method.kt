package com.moqi.kotlin.ch02

/**
 * 函数
 *
 * @author moqi On 12/2/20 11:48
 */
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun maxFun(a: Int, b: Int): Int = if (a > b) a else b

fun maxFun2(a: Int, b: Int): Int = if (a > b) a else b

fun main() {
    println("max(10, 100) = ${max(10, 100)}")
    println()
    println("maxFun(10, 20) = ${maxFun(10, 20)}")
    println()
    println("maxFun2(20, 30) = ${maxFun2(20, 30)}")
}
