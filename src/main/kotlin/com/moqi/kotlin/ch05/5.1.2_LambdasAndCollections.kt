package com.moqi.kotlin.ch05.ex1_2_LambdasAndCollections

import com.moqi.kotlin.ch03.joinToString

/**
 * Lambda 表达式和成员引用
 *
 * @author moqi On 12/4/20 15:57
 */
data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null

    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }

    println("theOldest = ${theOldest}")
}

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    findTheOldest(people)
    println()

    println("people.maxByOrNull { it.age } = ${people.maxByOrNull { it.age }}")
    println("people.maxByOrNull (Person::age) = ${people.maxByOrNull(Person::age)}")
    println()

    println("people.maxByOrNull { p: Person -> p.age } = ${people.maxByOrNull { p: Person -> p.age }}")
    println()

    val names = people.joinToString(separator = " ", transform = {p: Person -> p.name})
    println("names = ${names}")
    println(people.joinToString(" ") {p: Person -> p.name})
    println()

    println("people.maxByOrNull { p -> p.age } = ${people.maxByOrNull { p -> p.age }}")
    println()

    val getAge = {p: Person -> p.age}
    println("people.maxByOrNull(getAge) = ${people.maxByOrNull(getAge)}")
    println()
}
