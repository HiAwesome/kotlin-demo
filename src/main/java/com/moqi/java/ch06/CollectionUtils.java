package com.moqi.java.ch06;

import java.util.List;

/**
 * Java CollectionUtils
 *
 * @author moqi On 12/7/20 14:47
 */

public class CollectionUtils {

    public static List<String> uppercaseAll(List<String> items) {
        for (int i = 0; i < items.size(); i++) {
            items.set(i, items.get(i).toUpperCase());
        }
        return items;
    }

}
