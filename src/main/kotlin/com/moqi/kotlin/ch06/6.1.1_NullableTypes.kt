package com.moqi.kotlin.ch06.NullableTypes

/**
 * 可空类型
 *
 * @author moqi On 12/4/20 17:52
 */
fun strLenSafe(s: String?): Int =
    // if (s != null) s.length else 0
    s?.length ?: 0

fun main() {
    val x: String? = null
    println("strLenSafe(x) = ${strLenSafe(x)}")
    println("strLenSafe(\"abc\") = ${strLenSafe("abc")}")
    println()
}
