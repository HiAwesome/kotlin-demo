package com.moqi.kotlin.ch04.ex3_3_ClassDelegationUsingTheByKeyword

import java.util.HashSet

/**
 * 类委托：使用 by 关键字
 *
 * @author moqi On 12/4/20 14:25
 */
class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet {

    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }

}

fun main() {
    val countingSet = CountingSet<Int>()
    countingSet.addAll(listOf(1, 1, 2))
    println("${countingSet.objectsAdded} objects were added, ${countingSet.size} remain")
    countingSet.clear()
    println("countingSet.size = ${countingSet.size}")
}
