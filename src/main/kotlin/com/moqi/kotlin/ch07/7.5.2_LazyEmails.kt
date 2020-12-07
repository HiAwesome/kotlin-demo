package com.moqi.kotlin.ch07.LazyEmails

/**
 * 委托属性的基本操作
 *
 * @author moqi On 12/7/20 17:12
 */
class Email

class Person(val name: String) {
    private var _emails: List<Email>? = null

    val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmails(this)
            }
            return _emails!!
        }

}

class PersonLazy(val name: String) {
    val emails by lazy { loadEmailsLazy(this) }
}


fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return listOf()
}

fun loadEmailsLazy(person: PersonLazy): List<Email> {
    println("Load emails for ${person.name}")
    return listOf()
}

fun main() {
    val p = Person("Alice")
    println("p.emails = ${p.emails}")
    println("p.emails = ${p.emails}")
    println()

    val pz = PersonLazy("Alice")
    println("pz.emails = ${pz.emails}")
    println("pz.emails = ${pz.emails}")
    println()

}
