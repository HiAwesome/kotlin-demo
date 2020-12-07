package com.moqi.kotlin.ch06.ExtensionsForNullableTypes

/**
 * 可空性的扩展
 *
 * @author moqi On 12/7/20 11:09
 */
fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

fun main() {
    verifyUserInput(" ")
    verifyUserInput(null)
}
