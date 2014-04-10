package com.utils.string;

import junit.framework.Assert;
import org.junit.Test;

/**
 * User: ruslanpa
 * Date: 4/10/2014 2:18 PM
 */
public class StrUtilsTest {

    @Test
    public void testTransform() throws Exception {
        String incomingText = "Hello World";

        Assert.assertEquals(incomingText.toUpperCase(),
                StrUtils.transform(incomingText, StrUtils.TextTransform.UPPERCASE));

        Assert.assertEquals(incomingText.toLowerCase(),
                StrUtils.transform(incomingText, StrUtils.TextTransform.LOWERCASE));

        Assert.assertEquals(incomingText, StrUtils.transform(incomingText, StrUtils.TextTransform.NONE));
    }

    @Test
    public void testCount() throws Exception {
        Assert.assertEquals(0, StrUtils.count(null, 'a'));
        Assert.assertEquals(2, StrUtils.count("Test Text", 'T'));
        Assert.assertEquals(0, StrUtils.count("ttttttttt", 'q'));
    }
}
