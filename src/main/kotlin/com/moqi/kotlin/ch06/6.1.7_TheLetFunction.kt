package com.moqi.kotlin.ch06.ex1_7_TheLetFunction

/**
 * let 函数
 * 把一个调用它的对象编程 lambda 表达式的参数
 * 如果值不为空，则在 lambda 内部 it 是非空的，否则什么都不会发生
 *
 * @author moqi On 12/7/20 09:32
 */
fun sendMailTo(email: String) {
    println("Sending email to $email")
}

fun main() {
    val email: String? = "someone@gmail.com"
    email?.let { sendMailTo(it) }
    val email2 = null
    email2?.let { sendMailTo(it) }
}
