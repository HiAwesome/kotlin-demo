package com.moqi.kotlin.ch04.ex2_5_ChangingAccessorVisibility

/**
 * 修改访问器
 *
 * @author moqi On 12/4/20 10:58
 */
class LengthCounter {
    var counter: Int = 0
        // 不能在类外部修改这个属性
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main() {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi")
    println("lengthCounter.counter = ${lengthCounter.counter}")
}
