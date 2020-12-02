package com.moqi.kotlin.ch02

/**
 * 迭代事物
 *
 * @author moqi On 12/2/20 16:48
 */
fun fizzBuff(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main() {
    for (i in 1..100) {
        print(fizzBuff(i))
    }
    println()

    for (i in 100 downTo 1 step 2) {
        print(fizzBuff(i))
    }
    println()
}
