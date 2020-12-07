package com.moqi.kotlin.ch06.NothingType

/**
 * NothingType: 这个函数永不返回
 *
 * @author moqi On 12/7/20 11:53
 */
fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main() {
    fail("Error occurred")
}
