package com.moqi.kotlin.ch02

/**
 * 使用 When 处理枚举类型
 *
 * @author moqi On 12/2/20 15:57
 */
enum class Color3 {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getMnemonic(color: Color3) =
    when (color) {
        Color3.RED -> "Richard"
        Color3.ORANGE -> "Of"
        Color3.YELLOW -> "York"
        Color3.GREEN -> "Gave"
        Color3.BLUE -> "Battle"
        Color3.INDIGO -> "In"
        Color3.VIOLET -> "Vain"
    }

fun main() {
    println("getMnemonic(Color3.BLUE) = ${getMnemonic(Color3.BLUE)}")
}
