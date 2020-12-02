package com.moqi.kotlin.ch02

/**
 * 使用 in 检查集合和区间的成员
 *
 * @author moqi On 12/2/20 17:02
 */
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter"
    else -> "I don't know..."
}

fun main() {
    println("isLetter('q') = ${isLetter('q')}")
    println("isNotDigit('x') = ${isNotDigit('x')}")
    println()

    println("recognize('x') = ${recognize('x')}")
    println("recognize('8') = ${recognize('8')}")
    println("recognize(',') = ${recognize(',')}")
    println()

    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
    println()
}
