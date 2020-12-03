package com.moqi.kotlin.ch03

/**
 * 给别人的类添加方法：扩展函数和属性
 *
 * @author moqi On 12/3/20 09:51
 */
// fun String.lastChar(): Char = this.get(this.length - 1)
// fun String.lastChar(): Char = this.get(this.length - 1)
fun String.lastChar(): Char = get(length - 1)


fun main() {
    val aString = "Hello world"
    println("aString.lastChar() = ${aString.lastChar()}")
    println()
}
