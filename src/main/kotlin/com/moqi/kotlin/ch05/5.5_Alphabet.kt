package com.moqi.kotlin.ch05

/**
 * 带接收者的 lambda：with 与 apply
 *
 * @author moqi On 12/4/20 17:40
 */
fun alphabet(): String {
    val result = StringBuilder()

    for (letter in 'A'..'Z') {
        result.append(letter)
    }

    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun alphabetWith(): String {
    val result = StringBuilder()

    return with(result) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }

        append("\nNow I know the alphabet!")
        result.toString()
    }
}

fun alphabetWith2() = with(StringBuilder()) {
    for (letter in 'A'..'Z') append(letter)
    append("\nNow I know the alphabet!")
    toString()
}

fun alphabetApply() = StringBuilder().apply {
    for (letter in 'A'..'Z') append(letter)
    append("\nNow I know the alphabet!")
}.toString()

fun alphabetApply2() = buildString {
    for (letter in 'A'..'Z') append(letter)
    append("\nNow I know the alphabet!")
}

fun main() {
    println(alphabet())
    println()

    println(alphabetWith())
    println()

    println(alphabetWith2())
    println()

    println(alphabetApply())
    println()

    println(alphabetApply2())
    println()
}
