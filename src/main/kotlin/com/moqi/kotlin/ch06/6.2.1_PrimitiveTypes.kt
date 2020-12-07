package com.moqi.kotlin.ch06.PrimitiveTypes

/**
 * 基本数据类型
 * 可空的基本数据类型：Int? Boolean? 及其他
 *
 * @author moqi On 12/7/20 11:28
 */
fun showProgress(progress: Int) {
    val percent = progress.coerceIn(0, 100)
    println("We're ${percent}% done!")
}

data class Person(val name: String, val age: Int? = null) {

    fun isOrderThan(other: Person): Boolean? {
        if (age == null || other.age == null) {
            return null
        }
        return age > other.age
    }

}

fun main() {
    showProgress(146)
    println()

    println(Person("Sam", 35).isOrderThan(Person("Amy", 42)))
    println(Person("Sam", 35).isOrderThan(Person("Jack")))
    println()
}
