package com.moqi.kotlin.ch11.ExtensionsOnPrimitiveTypes

import java.time.LocalDate
import java.time.Period

/**
 * 实践中的 Kotlin DSL
 *
 * @author moqi On 12/10/20 11:56
 */
val Int.days: Period
    get() = Period.ofDays(this)

val Period.ago: LocalDate
    get() = LocalDate.now() - this

val Period.fromNow: LocalDate
    get() = LocalDate.now() + this

fun main() {
    println("1.days.ago = ${1.days.ago}")
    println("10.days.fromNow = ${10.days.fromNow}")
    println()
}
