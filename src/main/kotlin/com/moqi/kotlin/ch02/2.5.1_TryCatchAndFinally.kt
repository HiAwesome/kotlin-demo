package com.moqi.kotlin.ch02

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

/**
 * try catch finally
 *
 * @author moqi On 12/2/20 17:11
 */
fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

fun main() {
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}
