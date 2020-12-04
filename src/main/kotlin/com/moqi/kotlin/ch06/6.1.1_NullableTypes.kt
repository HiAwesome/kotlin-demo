package com.moqi.kotlin.ch06.NullableTypes

/**
 * 可空类型
 *
 * @author moqi On 12/4/20 17:52
 */
fun strLenSafe(s: String?): Int =
    // if (s != null) s.length else 0
    s?.length ?: 0

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println("allCaps = ${allCaps}")
}

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee): String? = employee.manager?.name

class Address(
    val streetAddress: String, val zipCode: Int,
    val city: String, val country: String
)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.countryName(): String {
    // return if (country != null) country else "Unknown"
    return company?.address?.country ?: "Unknown"
}

fun printShippingLabel(person: Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("No address")
    with(address) {
        println("streetAddress = ${streetAddress}")
        println("$zipCode $city, $country")
    }
}

fun main() {
    val x: String? = null
    println("strLenSafe(x) = ${strLenSafe(x)}")
    println("strLenSafe(\"abc\") = ${strLenSafe("abc")}")
    println()

    printAllCaps("abc")
    printAllCaps(null)
    println()

    val ceo = Employee("Da Boss", null)
    val develop = Employee("Bob Smith", ceo)
    println("managerName(develop) = ${managerName(develop)}")
    println("managerName(ceo) = ${managerName(ceo)}")
    println()

    val person = Person("Tom", null)
    println("person.countryName() = ${person.countryName()}")
    println()

    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person1 = Person("Tom", jetbrains)
    printShippingLabel(person1)

    /**
     * 错误非常清楚，指出了那个变量为 null
     * Exception in thread "main" java.lang.IllegalArgumentException: No address
     *  at com.moqi.kotlin.ch06.NullableTypes._6_1_1_NullableTypesKt.printShippingLabel(6.1.1_NullableTypes.kt:36)
     *  at com.moqi.kotlin.ch06.NullableTypes._6_1_1_NullableTypesKt.main(6.1.1_NullableTypes.kt:67)
     *  at com.moqi.kotlin.ch06.NullableTypes._6_1_1_NullableTypesKt.main(6.1.1_NullableTypes.kt)
     */
    printShippingLabel(Person("Alexey", null))
    println()

}
