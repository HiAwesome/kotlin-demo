package com.moqi.kotlin.ch04

/**
 * open, final 和 abstract 修饰符：默认为 final
 *
 * @author moqi On 12/3/20 16:05
 */
open class RichButton: Clickable {

    fun disable() {}

    open fun animate() {}

    // override fun click() {}

    /**
     * 禁止重写
     * 在这里 final 并没有被删减是因为没有 final 的 override 意味着是 open 的
     */
    final override fun click() {}

}

/**
 * 抽象类
 */
abstract class Animated {

    /**
     * 必须被子类实现
     */
    abstract fun animate()

    open fun stopAnimating() {}

    fun animateTwice() {}

}
