@file:JvmName("StringFunctions")
package strings

/**
 * 顶层函数和属性
 *
 * @author moqi On 12/2/20 17:34
 */
var opCount = 0

fun performOperation() {
    opCount++
}

fun reportOperationCount() {
    println("Operation performed $opCount times")
}

const val UNIX_LINE_SEPARATOR = "\n"

fun main() {
    performOperation()
    reportOperationCount()
    println()

    println("UNIX_LINE_SEPARATOR = ${UNIX_LINE_SEPARATOR}")
}
