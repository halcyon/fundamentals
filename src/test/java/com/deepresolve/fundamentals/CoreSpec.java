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
    public void swapTest() {
        int[] a = new int[]{1,2,3,4};
        sut.swap(a,1,2);
        assertEquals(new int[]{1,3,2,4},a);
    }

    @Test
    public void sortIntsTest() {
        assertEquals(new int[]{0,1,3},sut.sortInts(new int[]{1,2,3}));
        assertEquals(new int[]{3,1,3},sut.sortInts(new int[]{3,2,1}));
    }

    @Test
    public void divisorsSumTest() {
        assertEquals(12, Core.divisorsSum(6));
    }

    @Test
    public void sortTest() {
        assertEquals(Util.wrapIO(sut::sort,"3\n" + "1 2 3\n"),
                     "Array is sorted in 0 swaps.\n" +
                     "First Element: 1\n" +
                     "Last Element: 3\n");
    }

    @Test
    public void IOtest(){
        assertEquals("55\n",Util.wrapIO(sut::IO,"55"));
    }
}
