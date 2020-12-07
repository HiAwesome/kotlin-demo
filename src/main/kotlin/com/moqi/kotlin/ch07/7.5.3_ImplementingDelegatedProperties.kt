package com.moqi.kotlin.ch07.ImplementingDelegatedProperties

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * 实现委托属性 V4
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

    private val observer = {
        prop: KProperty<*>, oldValue: Int, newValue: Int
            ->
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)

    }

    var age: Int by Delegates.observable(age, observer)
    var salary: Int by Delegates.observable(salary, observer)
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
