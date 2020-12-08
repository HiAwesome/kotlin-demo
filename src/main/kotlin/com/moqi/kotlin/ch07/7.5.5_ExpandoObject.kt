package com.moqi.kotlin.ch07.ExpandoObject

/**
 * 在 map 中保存属性值
 *
 * @author moqi On 12/8/20 09:55
 */
class Person {

    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String
        get() = _attributes["name"]!!

    /**
     * 使用委托属性把值存放在 map 中
     */
    val company: String by _attributes
}

fun main() {
    val p = Person()
    val data = mapOf("name" to "Dmitry", "company" to "JetBrains")

    for ((attrName, value) in data) {
        p.setAttribute(attrName, value)
    }

    println("p.name = ${p.name}")
    println("p.company = ${p.company}")
    println()


}
