package com.moqi.kotlin.ch04

import java.io.File

/**
 * Object 关键字：将声明一个类与创建一个实例结合起来
 *
 * @author moqi On 12/4/20 14:34
 */
// 使用对象来实现 Comparator
object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}

// 使用嵌套类实现 Comparator
data class Person(val name: String) {
    object NameComparator : Comparator<Person> {
        override fun compare(p1: Person, p2: Person): Int = p1.name.compareTo(p2.name)
    }
}

fun main() {
    print(CaseInsensitiveFileComparator.compare(File("/User"), File("/user")))
    println()

    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))
    println("files = ${files}")
    println()

    val persons = listOf(Person("Bob"), Person("Alice"))
    println(persons.sortedWith(Person.NameComparator))
}
