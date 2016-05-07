package com.deepresolve.fundamentals;

import java.util.stream.IntStream;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

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

    void IO() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
    }

    public static void main(String[] args) {
        //properDivisors(12).forEach(element -> System.out.println(element));
        //        System.out.println(divisorsSum(6));
        Core sut = new Core();
        String data = "55";
        System.out.println(Util.wrapIO(sut::IO, data));
    }
}
