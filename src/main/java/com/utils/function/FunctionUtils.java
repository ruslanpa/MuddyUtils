package com.utils.function;

import java.util.ArrayList;
import java.util.Collection;

/**
 * User: ruslanpa
 * Date: 4/10/2014 6:16 PM
 */
public final class FunctionUtils {

    private FunctionUtils() {
        // Hidden constructor
    }

    public static void repeat(Block block, int times) {
        if (block == null) return;
        for (int i = 0; i < times; i++) {
            block.execute();
        }
    }

    public static <T> Collection<T> filter(Collection<T> collection, Predicate<T> predicate) {
        Collection<T> target = new ArrayList<T>();
        for (T t :collection) {
            if (predicate.apply(t)) {
                target.add(t);
            }
        }
        return target;
    }
}
