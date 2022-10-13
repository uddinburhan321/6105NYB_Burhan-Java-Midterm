package math_problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LowestNumber {

    /**
     * INSTRUCTIONS
     * Write a method to find the lowest number from this array.
     */

    public static void main(String[] args) {

        int[] array = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123,
                67, 5, 679, 54, 32, 65};
        System.out.println("Lowest from this array is: " + findLowestNumber(array));
    }

    static int findLowestNumber(int[] arr) {
        int lowestNumber;
        Arrays.sort(arr);
        lowestNumber = arr[0];
        return lowestNumber;
    }
}
