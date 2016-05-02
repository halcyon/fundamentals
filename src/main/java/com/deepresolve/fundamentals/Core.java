package com.deepresolve.fundamentals;

import java.util.stream.IntStream;


public class Core {
    public static int divisorsSum(int num) {
        // return IntStream.range(2, num/2 + 1).filter(i -> num % i == 0);
        return IntStream.range(1, num + 1).filter(i -> num % i == 0).sum();
    }
    public static void primes() {
        int num=50;
        int count=0;
        for(int i=1; i<= num; i++) {
            count=0;
            for(int j=2; j<=i/2; j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if(count == 0) {
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        //properDivisors(12).forEach(element -> System.out.println(element));
        System.out.println(divisorsSum(6));
    }
}
