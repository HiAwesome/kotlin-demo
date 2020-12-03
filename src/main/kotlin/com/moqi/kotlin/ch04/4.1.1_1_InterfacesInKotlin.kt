package com.moqi.kotlin.ch04

/**
 * 定义类继承结构
 *
 * @author moqi On 12/3/20 15:53
 */
interface Clickable {
    fun click()

    /**
     * 带默认实现的方法
     */
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable {
    override fun click() {
        println("I was clicked")
    }

    /**
     * 调用继承自接口方法的实现
     */
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main() {
    val button = Button()
    button.click()
    println()

    button.setFocus(true)
    println()

    Button().showOff()
}
