package com.moqi.kotlin.ch02.tryAsAnExpression

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

/**
 * try 作为表达式
 *
 * @author moqi On 12/2/20 17:15
 */
fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }

    println(number)
}

fun readNumber2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }

    println(number)
}

fun main() {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber(reader)
    println()
    readNumber2(reader)
}
