package com.moqi.kotlin.ch05.AllAnyCountFind

/**
 * all, any, count 和 find：对集合应用判断式
 *
 * @author moqi On 12/4/20 17:03
 */
data class Person(val name: String, val age: Int)

val canBeInClub27 = { p: Person -> p.age <= 27 }

fun main() {
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println("people.all(canBeInClub27) = ${people.all(canBeInClub27)}")
    println("people.any(canBeInClub27) = ${people.any(canBeInClub27)}")
    println()

    val list = listOf(1, 2, 3)
    println("!list.all { it == 3 } = ${!list.all { it == 3 }}")
    println("list.any { it != 3 } = ${list.any { it != 3 }}")
    println()

    println("people.count(canBeInClub27) = ${people.count(canBeInClub27)}")
    println()

    println("people.find(canBeInClub27) = ${people.find(canBeInClub27)}")
    println()
}
