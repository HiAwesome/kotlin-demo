package com.moqi.kotlin.ch03

/**
 * 多行三重符号的字符串
 *
 * @author moqi On 12/3/20 11:18
 */
const val kotlinLogo = """| //
                         .|//
                         .|/ \"""

fun main() {
    println(kotlinLogo.trimMargin("."))
}
