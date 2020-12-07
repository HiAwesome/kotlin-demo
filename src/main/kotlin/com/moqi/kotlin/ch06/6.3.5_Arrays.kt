package com.moqi.kotlin.ch06.Arrays

/**
 * 数组
 *
 * @author moqi On 12/7/20 14:55
 */
fun main(args: Array<String>) {
    for (i in args.indices) {
        println("Argument $i is: ${args[i]}")
    }
    println()

    val letters = Array(26) { i -> ('a' + i).toString() }
    println("letters.joinToString(\"\") = ${letters.joinToString("")}")
    println()

    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))
    println()

    val squares = IntArray(5) { i -> (i + 1) * (i + 1) }
    println("squares.joinToString() = ${squares.joinToString()}")
    println()

    squares.forEachIndexed { index, element ->
        println("Argument $index is: $element")
    }
}
