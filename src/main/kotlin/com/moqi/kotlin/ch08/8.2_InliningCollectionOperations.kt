package com.moqi.kotlin.ch08.InliningCollectionOperations

import java.io.BufferedReader
import java.io.FileReader

/**
 * 内联函数：消除 lambda 带来的运行时开销
 *
 * @author moqi On 12/8/20 17:34
 */
data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun readFirstLineFromFile(path: String): String {
    BufferedReader(FileReader(path)).use { br ->
        return br.readLine()
    }
}

fun main() {
    println("people.filter { it.age < 30 } = ${people.filter { it.age < 30 }}")
    println()

    println("people.filter { it.age > 30 }.map(Person::name) = ${people.filter { it.age > 30 }.map(Person::name)}")
    println()

    val path = "/Users/moqi/Code/kotlin-demo/src/main/resources/log4j.properties"
    println("readFirstLineFromFile(path) = ${readFirstLineFromFile(path)}")
    println()
}
