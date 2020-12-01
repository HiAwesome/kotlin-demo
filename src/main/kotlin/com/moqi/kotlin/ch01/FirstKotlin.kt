package com.moqi.kotlin.ch01

/**
 * Kotlin 初体验
 *
 * @author moqi On 12/1/20 11:59
 */
data class Person(val name: String, val age: Int? = null)

fun main() {
    val persons = listOf(Person("alice"),
            Person("Bob", age = 29))
    val oldest = persons.maxByOrNull { it.age ?: 0 }
    println("oldest = ${oldest}")
}