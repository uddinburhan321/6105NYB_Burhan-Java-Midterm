package math_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumber {

    /**
     * INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     * Print out the prime numbers in the given range.
     * <p>
     * BONUS: Figure out how to improve algorithmic efficiency
     */

    public static void main(String[] args) {
        primeNumbersList();
    }

    static void primeNumbersList() {

        List<Integer> primeNumber = new ArrayList<>();
        IntStream.range(2, 1_000_000)
                .filter(n -> primeNumber.parallelStream().noneMatch(p -> n % p == 0))
                .forEach(primeNumber::add);
        System.out.println("Prime numbers are: " + primeNumber);
    }
}
