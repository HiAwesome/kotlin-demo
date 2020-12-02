package com.moqi.kotlin.ch02.WhenBlockBranch

/**
 * 代码块作为 if 和 when 的分支
 *
 * @author moqi On 12/2/20 16:42
 */
interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun evalWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("e.value = ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("left + right = ${left + right}")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun main() {
    println("evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))) = ${evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4)))}")
}
