package com.moqi.kotlin.ch05.FlatMapFlatten

/**
 * flatMap 和 flatten：处理嵌套集合中的元素
 *
 * @author moqi On 12/4/20 17:13
 */
class Book(val title: String, val authors: List<String>)

fun main() {
    val strings = listOf("abc", "def")
    println("strings.flatMap { it.toList() } = ${strings.flatMap { it.toList() }}")
    println()

    val books = listOf(
        Book("Thursday Next", listOf("Jasper Fforde")),
        Book("Mort", listOf("Terry Pratchett")),
        Book(
            "Good Omens", listOf(
                "Terry Pratchett",
                "Neil Gaiman"
            )
        )
    )

    println("books.flatMap { it.authors }.toSet() = ${books.flatMap { it.authors }.toSet()}")
    println()
}
