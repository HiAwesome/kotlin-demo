package com.moqi.kotlin.ch04.ex3_2_1_DataClassCopy

/**
 * 数据类：自动生成通用方法的实现
 *
 * @author moqi On 12/4/20 11:37
 */
data class Client(val name: String, val postalCode: Int)

fun main() {
    val bob = Client("Bob", 973293)
    println(bob.copy(postalCode = 382555))
}
