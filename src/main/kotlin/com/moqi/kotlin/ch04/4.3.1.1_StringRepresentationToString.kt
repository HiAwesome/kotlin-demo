package com.moqi.kotlin.ch04.ex3_1_1_StringRepresentationToString

/**
 * 编译器生成的方法：数据类和类委托
 *
 * @author moqi On 12/4/20 11:21
 */
class Client(val name: String, val postalCode: Int) {
    override fun toString(): String = "Client(name=$name, postalCode=$postalCode)"

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name && postalCode == other.postalCode
    }

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}


fun main() {
    val client1 = Client("Alice", 342562)
    println(client1)
    println()

    val client2 = Client("Alice", 342562)
    println("client1 == client2 = ${client1 == client2}")
    println()

    val processed = hashSetOf(Client("Alice", 342562))
    println(processed.contains(Client("Alice", 342562)))
    println()
}
