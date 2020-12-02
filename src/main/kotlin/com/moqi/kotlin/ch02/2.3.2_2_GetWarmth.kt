package com.moqi.kotlin.ch02

/**
 * 使用 When 处理枚举类型
 *
 * @author moqi On 12/2/20 16:00
 */
enum class Color4 {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getWarmth(color: Color4) = when(color) {
    Color4.RED, Color4.ORANGE, Color4.YELLOW -> "warm"
    Color4.GREEN -> "neutral"
    Color4.BLUE, Color4.INDIGO, Color4.VIOLET -> "cold"
}

fun main() {
    println("getWarmth(Color4.INDIGO) = ${getWarmth(Color4.INDIGO)}")
}
