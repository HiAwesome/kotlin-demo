package com.moqi.kotlin.ch02

/**
 * 类和属性
 *
 * @author moqi On 12/2/20 15:31
 */
class Person(
    val name: String,
    var isMarried: Boolean
)

fun main() {
    val person = Person("Bob", true)
    println("person.name = ${person.name}")
    println("person.isMarried = ${person.isMarried}")
}
