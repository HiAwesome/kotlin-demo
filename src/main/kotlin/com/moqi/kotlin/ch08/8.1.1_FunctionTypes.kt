package com.moqi.kotlin.ch08.FunctionTypes

/**
 * 函数类型
 *
 * @author moqi On 12/8/20 15:22
 */
fun performRequest(
    url: String,
    callback: (code: Int, content: String) -> Unit
) {
    /*...*/
}

fun main() {
    val url = "http://kotlin.in"
    performRequest(url) { code, content -> /*...*/ }
    performRequest(url) { code, page -> /*...*/ }
}
