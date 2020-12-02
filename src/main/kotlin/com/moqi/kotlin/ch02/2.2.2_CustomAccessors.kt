package com.moqi.kotlin.ch02

/**
 * 自定义访问器
 *
 * @author moqi On 12/2/20 15:39
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
    get() {
        return height == width
    }
}

fun main() {
    val rectangle = Rectangle(41, 43)
    println("rectangle.isSquare = ${rectangle.isSquare}")
}
