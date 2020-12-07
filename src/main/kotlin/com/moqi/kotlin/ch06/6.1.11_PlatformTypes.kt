package com.moqi.kotlin.ch06

import com.moqi.java.ch06.Person

/**
 * 平台类型
 * 自己负责检查可空性
 *
 * @author moqi On 12/7/20 11:18
 */
fun yellAtSafe(person: Person) {
    println((person.name ?: "Anyone").toUpperCase() + "!!!")
}

fun main() {
    yellAtSafe(Person(null))
}
