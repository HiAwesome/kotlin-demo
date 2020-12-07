package com.moqi.kotlin.ch07.DestructuringDeclarationsAndLoops

/**
 * 解构声明和组件函数
 *
 * @author moqi On 12/7/20 16:46
 */
fun printEntries(map: Map<String, String>) {
    for ((key, value) in map) {
        println("$key -> $value")
    }
}

data class Point(val x: Int, val y: Int)

data class NameComponents(val name: String, val extension: String)

fun splitFilename(fullName: String): NameComponents {
    val result = fullName.split('.', limit = 2)
    return NameComponents(result[0], result[1])
}

fun splitFilename2(fullName: String): NameComponents {
    val (name, ext) = fullName.split('.', limit = 2)
    return NameComponents(name, ext)
}

fun main() {
    val map = mapOf("oracle" to "Java", "JetBrains" to "Kotlin")
    printEntries(map)
    println()

    val p = Point(10, 20)
    val (x, y) = p
    println("x = ${x}, y = ${y}")
    println()

    val (name, ext) = splitFilename("example.kt")
    println("name = ${name}, ext = ${ext}")
    println()

    val (name1, ext1) = splitFilename2("example.kt")
    println("name1 = ${name1}, ext1 = ${ext1}")
    println()
}
