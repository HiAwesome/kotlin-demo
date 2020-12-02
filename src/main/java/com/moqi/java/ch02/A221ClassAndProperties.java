package com.moqi.java.ch02;

import com.moqi.kotlin.ch02.Person;

/**
 * 类和属性
 *
 * @author moqi On 12/2/20 15:35
 */

public class A221ClassAndProperties {

    public static void main(String[] args) {

        Person person = new Person("Bob", true);
        System.out.println("person.getName() = " + person.getName());
        System.out.println("person.isMarried() = " + person.isMarried());

    }

}
