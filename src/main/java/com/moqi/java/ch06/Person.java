package com.moqi.java.ch06;

/**
 * 没有可空性注解的 Java 类
 *
 * @author moqi On 12/7/20 11:17
 */

public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
