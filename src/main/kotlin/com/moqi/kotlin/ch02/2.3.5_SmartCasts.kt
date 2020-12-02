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


fun eval2(e: Expr): Int =

    if (e is Num) {
        e.value
    } else if (e is Sum) {
        eval2(e.right) + eval2(e.left)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

fun eval3(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval3(e.right) + eval3(e.left)
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun main() {
    println("eval(Sum(Sum(Num(1), Num(2)), Num(4))) = ${eval(Sum(Sum(Num(1), Num(2)), Num(4)))}")
    println("eval2(Sum(Sum(Num(1), Num(2)), Num(4))) = ${eval2(Sum(Sum(Num(1), Num(2)), Num(4)))}")
    println("eval3(Sum(Sum(Num(1), Num(2)), Num(4))) = ${eval3(Sum(Sum(Num(1), Num(2)), Num(4)))}")
}
