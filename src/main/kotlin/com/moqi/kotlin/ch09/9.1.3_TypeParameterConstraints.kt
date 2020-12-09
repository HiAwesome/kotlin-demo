package com.moqi.kotlin.ch09

import java.lang.Appendable

/**
 * 类型参数约束
 *
 * @author moqi On 12/9/20 11:02
 */
fun <T : Number> oneHalf(value: T): Double {
    return value.toDouble() / 2.0
}

fun <T : Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
}

fun <T> ensureTrailingPeriod(seq: T)
        where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.')) {
        seq.append('.')
    }
}

fun main() {
    println("oneHalf(3) = ${oneHalf(3)}")
    println()

    println("max(\"kotlin\", \"java\") = ${max("kotlin", "java")}")
    println()

    val helloWorld = StringBuilder("Hello World")
    ensureTrailingPeriod(helloWorld)
    println("helloWorld = ${helloWorld}")
}
