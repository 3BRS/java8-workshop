package eu.keyup.workshop.java8.stream;

import eu.keyup.workshop.java8.helper.Helper;

import java.util.List;
import java.util.stream.Collectors;

public class Example11Parallelism {

    public static void main(String[] args) {
        List<Integer> list = Helper.range(2, 100000);

        long start = System.currentTimeMillis();

        System.out.println(
                list.parallelStream()
                .filter(n -> isPrime(n))
                .count()
        );

        System.out.println("TIME: " + (System.currentTimeMillis() - start) + "ms");
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
