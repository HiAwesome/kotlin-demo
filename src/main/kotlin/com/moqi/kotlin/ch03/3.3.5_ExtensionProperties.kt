package com.moqi.kotlin.ch03

/**
 * 扩展属性
 *
 * @author moqi On 12/3/20 10:23
 */
val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) {
        this.setCharAt(length - 1, value)
    }

fun main() {
    println("Kotlin".lastChar)
    val sb = java.lang.StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println("sb = ${sb}")
    println()
}
