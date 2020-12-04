package com.moqi.kotlin.ch05.CollectionLambda

/**
 * 集合的函数式 API
 *
 * @author moqi On 12/4/20 16:48
 */
data class Person(val name: String, val age: Int)

fun main() {
    val list = listOf(1, 2, 3, 4)
    println("list.filter { it % 2 == 0 } = ${list.filter { it % 2 == 0 }}")
    println()

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println("people.filter { it.age > 30 } = ${people.filter { it.age > 30 }}")
    println()

    println("list.map { it * it } = ${list.map { it * it }}")
    println()

    println("people.map { it.name } = ${people.map { it.name }}")
    println("people.map(Person::name) = ${people.map(Person::name)}")
    println()

    println("people.filter { it.age > 30 }.map(Person::name) = ${people.filter { it.age > 30 }.map(Person::name)}")
    println()

    // 假设集合中有 100 个人，寻找最大年龄的过程就会执行 100 遍
    val v1 = people.filter { it.age == people.maxByOrNull(Person::age)!!.age }
    println("v1 = ${v1}")

    val maxAge = people.maxByOrNull(Person::age)!!.age
    println("people.filter { it.age == maxAge } = ${people.filter { it.age == maxAge }}")
    println()

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })
    println()
}
