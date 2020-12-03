package com.moqi.kotlin.ch03

/**
 * 字符串和正则表达式
 *
 * @author moqi On 12/3/20 10:58
 */
fun main() {
    // println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split("[.\\-]".toRegex()))
    println()
    // 指定多个分割符
    println("12.345-6.A".split(".", "-"))
}
