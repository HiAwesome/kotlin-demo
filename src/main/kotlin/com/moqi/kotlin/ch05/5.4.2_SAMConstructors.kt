package com.moqi.kotlin.ch05

/**
 * SAM 接口
 *
 * @author moqi On 12/4/20 17:35
 */
fun createAllDoneRunnable(): Runnable {
    return Runnable { println("ALl done!!!") }
}

fun main() {
    createAllDoneRunnable().run()
}
