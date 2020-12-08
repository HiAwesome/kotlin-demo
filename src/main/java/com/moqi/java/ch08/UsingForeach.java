package com.moqi.java.ch08;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;

import java.util.ArrayList;
import java.util.List;

/**
 * Java UsingForeach
 *
 * @author moqi On 12/8/20 19:05
 */

public class UsingForeach {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("42");
        CollectionsKt.forEach(strings, s -> {
            System.out.println("s = " + s);
            return Unit.INSTANCE;
        });

    }

}
