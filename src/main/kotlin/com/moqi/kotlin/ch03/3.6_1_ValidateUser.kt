package com.moqi.kotlin.ch03

/**
 * 带重复代码的函数
 *
 * @author moqi On 12/3/20 11:22
 */
class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}: Empty Name")
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}: Empty Address")
    }

    // 保存 user 到数据库
}

fun main() {
    saveUser(User(1, "", ""))
}
