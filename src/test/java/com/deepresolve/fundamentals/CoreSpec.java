package com.deepresolve.fundamentals;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Arrays;

public class CoreSpec {
    private Core sut;

    @BeforeClass
    public void setupClass() {
        sut = new Core();
    }

    @Test
    public void testPrimes() {
        assertEquals(Arrays.asList(2,3,5,7,11),sut.primes(5));
    }
    @Test
    public void testDivisorsSum() {
        assertEquals(12, Core.divisorsSum(6));
    }
}
