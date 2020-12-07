package com.moqi.kotlin.ch07.EqualityOperators

/**
 * 重载比较运算符
 *
 * @author moqi On 12/7/20 16:03
 */
class Point(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Point) return false
        return x == other.x && y == other.y
    }
}

class Person(
    val firstName: String, val lastName: String
) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
    }

}

fun main() {
    println(Point(10, 20) == Point(10, 20))
    println(Point(10, 20) != Point(5, 5))
    println(null == Point(1, 2))
    println()

    val p1 = Person("Alice", "Smith")
    val p2 = Person("Bob", "Johnson")
    println("p1 < p2 = ${p1 < p2}")
    println()

    println("abc" < "bac")
    println()
}
