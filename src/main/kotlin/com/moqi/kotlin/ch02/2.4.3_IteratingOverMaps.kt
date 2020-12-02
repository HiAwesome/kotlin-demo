package com.moqi.kotlin.ch02

import java.util.TreeMap

/**
 * 迭代 Map
 *
 * @author moqi On 12/2/20 16:53
 */
fun main() {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}
