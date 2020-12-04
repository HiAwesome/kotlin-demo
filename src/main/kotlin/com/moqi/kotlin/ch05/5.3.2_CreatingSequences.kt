package com.moqi.kotlin.ch05

import java.io.File

/**
 * 创建序列
 *
 * @author moqi On 12/4/20 17:26
 */
fun File.isInsideHiddenDirectory() =
    generateSequence(this) { it.parentFile }.any { it.isHidden }

fun main() {
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println("numbersTo100.sum() = ${numbersTo100.sum()}")
    println()

    val file = File("/Users/moqi/Downloads")
    println("file.isInsideHiddenDirectory() = ${file.isInsideHiddenDirectory()}")
    println()
}
