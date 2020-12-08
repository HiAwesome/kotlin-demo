package com.moqi.kotlin.ch08.LookForAlice

/**
 * 高阶函数中的控制流
 *
 * @author moqi On 12/8/20 17:54
 */
data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun lookForAlice(people: List<Person>) {
    for (person in people) {
        if (person.name == "Alice") {
            println("Found!")
            return
        }
    }

    println("Alice is not found")
}

fun lookForAlice2(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") {
            println("Found!")
            return
        }
    }

    println("Alice is not found")
}

fun lookForAliceLabel(people: List<Person>) {
    people.forEach label@{
        if (it.name == "Alice") return@label
    }

    println("Alice might be somewhere")
}

fun lookForAliceLabel2(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") return@forEach
    }

    println("Alice might be somewhere")
}

fun lookForAliceFinal(people: List<Person>) {
    people.forEach(fun(person) {
        if (person.name == "Alice") return
        println("${person.name} is not Alice")
    })
}

fun main() {
    lookForAlice(people)
    println()

    lookForAlice2(people)
    println()

    lookForAliceLabel(people)
    println()

    lookForAliceLabel2(people)
    println()

    println(StringBuilder().apply sb@{
        listOf(1, 2, 3).apply {
            this@sb.append(this.toString())
        }
    })
    println()

    lookForAliceFinal(people)
    println()
}
