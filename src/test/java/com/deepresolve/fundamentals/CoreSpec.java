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
    public void primesTest() {
        assertEquals(Arrays.asList(2,3,5,7,11),
                     sut.primes(5));
    }
    @Test
    public void divisorsSumTest() {
        assertEquals(12, Core.divisorsSum(6));
    }

    @Test
    public void IOtest(){
        assertEquals("55\n",
                     (Util.wrapIO(sut::IO,"55")));
    }
}
