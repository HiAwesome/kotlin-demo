@file:JvmName("ProcessTheAnswer")

package com.moqi.kotlin.ch08

/**
 * 在 Java 中使用函数类
 *
 * @author moqi On 12/8/20 15:35
 */
fun processTheAnswer(f: (Int) -> Int) {
    println(f(42))
}
