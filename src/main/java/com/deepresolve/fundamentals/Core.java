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

    void swap(int[] nums, int i, int j) {
        int left = nums[i];
        int right = nums[j];
        nums[i] = right;
        nums[j] = left;
    }

    int[] sortInts(int[] nums) {
        int totalSwaps = 0;
        for (int i = 0; i < nums.length; i++) {
            int numberOfSwaps = 0;
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    numberOfSwaps++;
                    totalSwaps++;
                }
            }
            if (numberOfSwaps == 0) {
                break;
            }
        }
        return new int[]{totalSwaps,nums[0],nums[nums.length-1]};
    }

    void sort() {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        int[] results = new int[3];
        for(int i = 0 ; i < length; i++) {
            array[i] = scan.nextInt();
        }
        results = sortInts(array);
        System.out.println("Array is sorted in " + results[0] + " swaps.");
        System.out.println("First Element: " + results [1]);
        System.out.println("Last Element: " + results [2]);
    }

    public static void main(String[] args) {
        //properDivisors(12).forEach(element -> System.out.println(element));
        //        System.out.println(divisorsSum(6));
        Core sut = new Core();
        String data = "55";
        System.out.println(Util.wrapIO(sut::IO, data));
    }
}
