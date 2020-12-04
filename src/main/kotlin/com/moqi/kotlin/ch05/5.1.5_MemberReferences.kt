package com.moqi.kotlin.ch05.ex1_5_2_MemberReferences1

/**
 * 成员引用
 *
 * @author moqi On 12/4/20 16:43
 */
fun salute() = println("Salute!")

data class Person(val name: String, val age: Int)

fun main() {
    run(::salute)
    println()

    val createPerson = ::Person
    val p = createPerson("Tom", 30)
    println("p = ${p}")
}
