package com.moqi.kotlin.ch04

import java.io.Serializable

/**
 * 声明一个包含序列化状态的视图
 *
 * @author moqi On 12/3/20 16:23
 */
interface State : Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}


class Button1 : View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {}

    /**
     * 这个类与 Java 中的静态嵌套类相似
     */
    class ButtonState : State

}

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}
