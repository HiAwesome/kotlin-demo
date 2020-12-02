package com.moqi.kotlin.ch02

/**
 * 声明一个带属性的枚举类
 *
 * @author moqi On 12/2/20 15:53
 */
enum class Color2(
    val r: Int, val g: Int, val b: Int
) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main() {
    println("Color2.RED.rgb() = ${Color2.RED.rgb()}")
}
