package com.moqi.kotlin.ch03

/**
 * 正则表达式和三重引号的字符串
 *
 * @author moqi On 12/3/20 11:02
 */
fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: $directory, name: $fileName, ext: $extension")
}

fun parsePathByRegex(path: String) {
    // 三重引号不需要转义
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)

    // if (Objects.nonNull(matchResult)) { 这样写会让 matchResult.destructured 无法通过编译
    if (matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured
        println("Dir: $directory, name: $fileName, ext: $extension")
    }
}

fun main() {
    val path = "/Users/moqi/Code/kotlin-demo/src/main/kotlin/com/moqi/kotlin/ch03/3.5.2_1_ParsePath.kt"
    parsePath(path)
    println()

    parsePathByRegex(path)
    println()
}
