package com.moqi.kotlin.ch02

/**
 * 更简单的字符串格式化：字符串模版
 *
 * @author moqi On 12/2/20 15:18
 */
fun main(args: Array<String>) {
    println("Hello, ${if (args.isNotEmpty()) args[0] else "someone"}!")
}
