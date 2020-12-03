package com.moqi.kotlin.ch04

/**
 * 密封类：定义受限的类继承结构
 *
 * @author moqi On 12/3/20 16:55
 */
interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

/**
 * 作为密封类的表达式
 */
sealed class Expr1 {
    class Num(val value: Int) : Expr1()
    class Sum(val left: Expr1, val right: Expr1) : Expr1()
}

fun eval(e: Expr1): Int =
    // when 表达式涵盖了所有可能的情况，所以不再需要 else 分支
    when (e) {
        is Expr1.Num -> e.value
        is Expr1.Sum -> eval(e.right) + eval(e.left)
    }

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(eval(Expr1.Sum(Expr1.Sum(Expr1.Num(1), Expr1.Num(2)), Expr1.Num(4))))
}
