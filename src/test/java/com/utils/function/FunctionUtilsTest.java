package com.utils.function;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * User: ruslanpa
 * Date: 4/10/2014 6:20 PM
 */
public class FunctionUtilsTest {

    @Test
    public void testRepeat() throws Exception {
        final List<Long> counter = new LinkedList<Long>();
        FunctionUtils.repeat(new Block() {
            @Override
            public void execute() {
                counter.add(System.currentTimeMillis());
            }
        }, 3);
        Assert.assertEquals(3, counter.size());
    }
}
