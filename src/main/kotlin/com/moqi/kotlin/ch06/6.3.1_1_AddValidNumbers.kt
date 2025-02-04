package com.moqi.kotlin.ch06.AddValidNumbers

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

/**
 * 可空性与集合
 *
 * @author moqi On 12/7/20 11:57
 */
fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>()

    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            result.add(number)
        } catch (e: NumberFormatException) {
            result.add(null)
        }
    }

    return result
}

fun addValidNumbers(numbers: List<Int?>) {
    var sumOfValidNumbers = 0
    var invalidNumbers = 0

    for (number in numbers) {
        if (number != null) {
            sumOfValidNumbers += number
        } else {
            invalidNumbers++
        }
    }

    println("sumOfValidNumbers = ${sumOfValidNumbers}")
    println("invalidNumbers = ${invalidNumbers}")
}

fun addValidNumbersFilter(numbers: List<Int?>) {
    // 对包含可空值的集合使用 filterNotNull
    val validNumbers = numbers.filterNotNull()
    println("Sum of valid numbers: ${validNumbers.sum()}")
    println("Invalid numbers: ${numbers.size - validNumbers.size}")
}

fun main() {
    val reader = BufferedReader(StringReader("1\nabc\n42"))
    val numbers = readNumbers(reader)
    addValidNumbers(numbers)
    println()

    addValidNumbersFilter(numbers)
    println()
}
