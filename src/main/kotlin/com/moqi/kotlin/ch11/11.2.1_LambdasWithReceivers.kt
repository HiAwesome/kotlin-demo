package com.moqi.kotlin.ch11.LambdasWithReceivers

/**
 * 带接收者的 lambda 和扩展函数类型
 *
 * @author moqi On 12/10/20 11:15
 */
fun buildString(
    builderAction: (StringBuilder) -> Unit
): String {
    val sb = StringBuilder()
    builderAction(sb)
    return sb.toString()
}

fun buildStringV2(
    builderAction: StringBuilder.() -> Unit
): String {
    val sb = StringBuilder()
    sb.builderAction()
    return sb.toString()
}

val appendExcl: StringBuilder.() -> Unit = { this.append("!") }

fun main() {
    val s = buildString {
        it.append("Hello, ")
        it.append("World!")
    }
    println("s = ${s}")
    println()

    val s2 = buildStringV2 {
        this.append("Hello, ")
            .append("World!")
    }
    println("s2 = ${s2}")
    println()

    val sb = StringBuilder("Hi")
    sb.appendExcl()
    println("sb = ${sb}")
    println("buildString(appendExcl) = ${buildString(appendExcl)}")
    println()

    val map = mutableMapOf(1 to "one")
    map.apply { this[2] = "two" }
    map.apply { this[3] = "three" }
    println("map = ${map}")
    println()
}
