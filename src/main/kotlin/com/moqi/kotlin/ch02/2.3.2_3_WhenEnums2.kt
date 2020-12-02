package com.moqi.kotlin.ch02

import com.moqi.kotlin.ch02.Color4.*

/**
 * 使用 When 处理枚举类型
 *
 * @author moqi On 12/2/20 16:02
 */
fun getWarmth2(color: Color4) = when (color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun main() {
    println("getWarmth2(INDIGO) = ${getWarmth2(VIOLET)}")
}
