package com.moqi.kotlin.ch04.ex4_2_1_CompanionObjects

/**
 * 伴生对象：工厂方法和静态成员的地盘
 *
 * @author moqi On 12/4/20 15:01
 */
class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

fun getFacebookName(accountId: Int) = "fb:$accountId"

/**
 * 定义一个拥有多个从构造方法的类
 */
class User1 {
    val nickName: String

    constructor(email: String) {
        nickName = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
        nickName = getFacebookName(facebookAccountId)
    }
}

/**
 * 使用工厂方法来替代从构造方法
 */
class User private constructor(val nickName: String) {
    companion object {
        fun newSubscribingUser(email: String) =
            User(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) =
            User(getFacebookName(accountId))
    }
}

fun main() {
    A.bar()
    println()

    val subscribingUser = User.newSubscribingUser("Bob@gmail.com")
    val facebookUser = User.newFacebookUser(4)
    println("subscribingUser.nickName = ${subscribingUser.nickName}")
    println("facebookUser.nickName = ${facebookUser.nickName}")
    println()
}
