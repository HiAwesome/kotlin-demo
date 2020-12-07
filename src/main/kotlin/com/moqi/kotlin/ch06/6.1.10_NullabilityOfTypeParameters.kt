package com.moqi.kotlin.ch06.NullabilityOfTypeParameters

/**
 * 类型参数的可空性
 *
 * @author moqi On 12/7/20 11:14
 */
fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

fun main() {
    printHashCode(null)
}
