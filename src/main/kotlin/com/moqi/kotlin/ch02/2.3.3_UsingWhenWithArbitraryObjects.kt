package com.moqi.kotlin.ch02

import com.moqi.kotlin.ch02.Color4.*

/**
 * 在 when 结构中使用任意对象
 *
 * @author moqi On 12/2/20 16:04
 */
fun mix(c1: Color4, c2: Color4) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

fun main() {
    println("mix(RED, YELLOW) = ${mix(RED, YELLOW)}")
    println("mix(ORANGE, YELLOW) = ${mix(ORANGE, YELLOW)}")
}
