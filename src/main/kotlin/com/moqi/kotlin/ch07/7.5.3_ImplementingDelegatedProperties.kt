package com.moqi.kotlin.ch07.ImplementingDelegatedProperties

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

/**
 * 实现委托属性
 *
 * @author moqi On 12/7/20 17:47
 */
open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}


class Person(
    val name: String, age: Int, salary: Int
) : PropertyChangeAware() {

    var age: Int = age
        set(newValue) {
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange("age", oldValue, newValue)
        }

    var salary: Int = salary
        set(newValue) {
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange("salary", oldValue, newValue)
        }
}

fun main() {
    val p = Person("Dmitry", 34, 2000)
    p.addPropertyChangeListener(
        PropertyChangeListener { event ->
            println(
                "Property ${event.propertyName} changed " +
                        "from ${event.oldValue} to ${event.newValue}"
            )
        }
    )

    p.age = 35
    p.salary = 2100
}
