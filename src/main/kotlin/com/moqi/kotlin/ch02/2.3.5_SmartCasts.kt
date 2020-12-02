package com.moqi.kotlin.ch02

/**
 * 智能转换
 * is 判定类型后会自动转换
 *
 * @author moqi On 12/2/20 16:12
 */
interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    /*if (e is Num) {
        val n = e as Num
        return n.value
    }*/

    if (e is Num) {
        return e.value
    }

    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }

    throw IllegalArgumentException("Unknown expression")
}

fun main() {
    println("eval(Sum(Sum(Num(1), Num(2)), Num(4))) = ${eval(Sum(Sum(Num(1), Num(2)), Num(4)))}")
}
