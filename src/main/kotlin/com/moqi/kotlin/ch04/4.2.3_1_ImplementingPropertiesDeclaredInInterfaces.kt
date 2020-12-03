package com.moqi.kotlin.ch04.ImplementingPropertiesDeclaredInInterfaces0

/**
 * 实现在接口中声明的属性
 *
 * @author moqi On 12/3/20 17:40
 */
interface User {
    val nickName: String
}

interface User1 {
    val email: String
    // 属性没有支持字段：结果值在每次访问时通过计算得到
    val nickName: String
        get() = email.substringBefore('@')
}

class PrivateUser(override val nickName: String) : User

class SubscribingUser(val email: String) : User {
    override val nickName: String
        get() = email.substringBefore('@')
}

fun getFacebookName(accountId: Int) = "fb:$accountId"

class FacebookUser(val accountId: Int) : User {
    override val nickName: String
        get() = getFacebookName(accountId)
}

fun main() {
    println(PrivateUser("test@kotlinlang.org").nickName)
    println(SubscribingUser("test@kotlinlang.org").nickName)
}
