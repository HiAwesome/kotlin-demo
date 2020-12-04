package com.moqi.kotlin.ch06.ex1_5_SafeCastsAs

/**
 * 安全转换 as？
 * 非空断言 !!
 *
 * @author moqi On 12/4/20 19:22
 */
class Person(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? Person ?: return false

        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int =
        firstName.hashCode() * 37 + lastName.hashCode()
}

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println("sNotNull.length = ${sNotNull.length}")
}

fun main() {
    val p1 = Person("Dmitry", "Jemerov")
    val p2 = Person("Dmitry", "Jemerov")
    println("p1 == p2 = ${p1 == p2}")
    println("p1.equals(42) = ${p1.equals(42)}")
    println()

    ignoreNulls("abc")
    ignoreNulls(null)
}
