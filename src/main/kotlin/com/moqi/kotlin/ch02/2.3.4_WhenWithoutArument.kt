package com.moqi.kotlin.ch02

import com.moqi.kotlin.ch02.Color4.*

/**
 * 使用不带参数的 when
 *
 * @author moqi On 12/2/20 16:09
 */
fun mix2(c1: Color4, c2: Color4) =
    when {
        (c1 == RED && c2 == YELLOW) ||
        (c1 == YELLOW && c2 == RED) ->
            ORANGE

        (c1 == YELLOW && c2 == BLUE) ||
        (c1 == BLUE && c2 == YELLOW) ->
            GREEN

        (c1 == BLUE && c2 == VIOLET) ||
        (c1 == VIOLET && c2 == BLUE) ->
            INDIGO

        else -> throw Exception("Dirty color")
    }

fun main() {
    println("mix2(BLUE, VIOLET) = ${mix2(BLUE, VIOLET)}")
}
