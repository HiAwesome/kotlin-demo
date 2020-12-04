package com.moqi.kotlin.ch04.ex2_4_AccessingABackingFieldFromAGetterOrSetter

/**
 * 通过 getter 或 setter 访问支持字段
 *
 * @author moqi On 12/4/20 10:48
 */
class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent()
            )
            field = value
        }
}

fun main() {
    val user = User("Alice")
    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"
}
