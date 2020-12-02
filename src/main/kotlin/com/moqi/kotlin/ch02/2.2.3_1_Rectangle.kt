package geometry.shapes

import java.util.Random
/**
 * Kotlin 源码布局：目录和包
 *
 * @author moqi On 12/2/20 15:42
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
    get() = height == width
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}
