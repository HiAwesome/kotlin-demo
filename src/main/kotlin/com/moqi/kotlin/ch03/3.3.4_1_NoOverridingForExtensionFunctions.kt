package com.moqi.kotlin.ch03

/**
 * 不可重写的扩展函数
 *
 * @author moqi On 12/3/20 10:15
 */
open class View {
    open fun click() = println("View clicked")
}

class Button : View() {
    override fun click() {
        println("Button clicked")
    }
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main() {
    val view: View = Button()
    view.click()
    // 不能重写扩展函数
    view.showOff()
}
