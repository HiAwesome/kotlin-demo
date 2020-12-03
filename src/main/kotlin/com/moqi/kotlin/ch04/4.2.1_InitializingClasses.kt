package com.moqi.kotlin.ch04

/**
 * 声明一个带非默认构造方法或属性的类
 *
 * @author moqi On 12/3/20 17:11
 */
class User(val nickName:String, val isSubscribed: Boolean = true)

fun main() {
    val alice = User("Alice")
    println("alice.isSubscribed = ${alice.isSubscribed}")
    val bob = User("Bob", false)
    println("bob.isSubscribed = ${bob.isSubscribed}")
    val carol = User(isSubscribed = false, nickName = "Carol")
    println("carol.isSubscribed = ${carol.isSubscribed}")
}
