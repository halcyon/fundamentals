package com.deepresolve.fundamentals;

import java.util.stream.IntStream;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class Core {
    public static int divisorsSum(int num) {
        // return IntStream.range(2, num/2 + 1).filter(i -> num % i == 0);
        return IntStream.range(1, num + 1).filter(i -> num % i == 0).sum();
    }

    Collection<Integer> primes(int numPrimes) {
        final List<Integer> primes = new ArrayList<>(numPrimes);
        IntStream.iterate(2, i -> i + 1).
            filter(i -> {
                    for (int prime : primes)
                        if (i % prime == 0)
                            return false;
                    return true;
                }).limit(numPrimes).
            forEach(primes::add);
        return primes;
    }

    public static void main(String[] args) {
        //properDivisors(12).forEach(element -> System.out.println(element));
        System.out.println(divisorsSum(6));
    }
}
