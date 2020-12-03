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

fun saveUser2(user: User) {
    // 局部函数
    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: Empty $fieldName")
        }
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")

    // 保存 user 到数据库
}

fun saveUser3(user: User) {
    // 局部函数使用外部函数的参数
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: Empty $fieldName")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")

    // 保存 user 到数据库
}

/**
 * 提取逻辑到扩展函数
 */
fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id: Empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser4(user: User) {
    user.validateBeforeSave()

    // 保存 user 到数据库
}

fun main() {
    // saveUser(User(1, "", ""))
    println()

    // saveUser2(User(1, "", ""))
    println()

    // saveUser3(User(1, "", ""))
    println()

    saveUser4(User(1, "", ""))
}
