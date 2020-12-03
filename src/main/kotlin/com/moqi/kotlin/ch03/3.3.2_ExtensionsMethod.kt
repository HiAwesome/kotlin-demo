package strings

import com.moqi.kotlin.ch03.lastChar
// 函数别名
import com.moqi.kotlin.ch03.lastChar as last

/**
 * 导入扩展函数
 *
 * @author moqi On 12/3/20 09:57
 */
fun main() {
    println("\"moqimoqide\".lastChar() = ${"moqimoqide".lastChar()}")
    println("\"moqimoqide\".last() = ${"moqimoqide".last()}")
}
