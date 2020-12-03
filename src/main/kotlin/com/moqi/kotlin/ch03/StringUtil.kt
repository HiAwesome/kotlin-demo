@file:JvmName("StringUtil")
package strings

/**
 * 从 Java 中调用扩展函数
 *
 * @author moqi On 12/3/20 10:03
 */
fun String.lastChar(): Char = get(length - 1)
