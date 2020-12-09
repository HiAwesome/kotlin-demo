package com.moqi.kotlin.ch10

import kotlin.reflect.full.callSuspend

/**
 * 注解与反射
 *
 * @author moqi On 12/9/20 15:42
 */
class Person(val name: String, val age: Int)

fun foo(x: Int) = println(x)

var counter = 0

suspend fun main() {
    val person = Person("Alice", 29)
    val kClass = person.javaClass.kotlin
    println("kClass.simpleName = ${kClass.simpleName}")
    kClass.members.forEach { println("it.name = ${it.name}") }
    println()

    val kFunction = ::foo
    kFunction.callSuspend(42)
    println()

    val kProperty = ::counter
    kProperty.setter.call(21)
    println("kProperty.get() = ${kProperty.get()}")
    println()

    val person1 = Person("Alice", 33)
    val memberProperty = Person::age
    println("memberProperty.get(person1) = ${memberProperty.get(person1)}")
    println()
}
