package com.deepresolve.fundamentals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CoreSpec {
    @Test
    public void testDivisorsSum() {
        Assert.assertEquals(12, Core.divisorsSum(6));
    }
}
