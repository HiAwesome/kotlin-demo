package com.moqi.kotlin.ch05.GroupBy

/**
 * GroupBy：把列表转换成分组的 map
 *
 * @author moqi On 12/4/20 17:10
 */
data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31), Person("Carol", 31))
    println("people.groupBy { it.age } = ${people.groupBy { it.age }}")
    println()

    val list = listOf("a", "ab", "b")
    println("list.groupBy(String::first) = ${list.groupBy(String::first)}")
    println()
}
