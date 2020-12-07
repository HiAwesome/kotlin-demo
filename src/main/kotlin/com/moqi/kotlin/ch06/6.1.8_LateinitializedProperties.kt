package com.moqi.kotlin.ch06.LateinitializedProperties

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * 延迟初始化的属性
 *
 * @author moqi On 12/7/20 10:50
 */
class MyService1 {
    fun performAction(): String = "Foo"
}

class MyTest1 {
    private var myService1: MyService1? = null

    @BeforeEach
    fun setUp() {
        myService1 = MyService1()
    }

    @Test
    fun testAction() {
        Assertions.assertEquals("Foo", myService1!!.performAction())
    }
}

class MyService2 {
    fun performAction(): String = "Foo"
}

class MyTest2 {
    private lateinit var myService2: MyService2

    @BeforeEach
    fun setUp() {
        myService2 = MyService2()
    }

    /**
     * 不需要 !! 非空断言
     */
    @Test
    fun testAction() {
        Assertions.assertEquals("Foo", myService2.performAction())
    }
}
