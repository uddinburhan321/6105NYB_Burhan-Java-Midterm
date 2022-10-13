package math_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumber {

    /**
     * INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static void main(String[] args) {

        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6}; //{10, 2, 1, 4, 5, 3, 7, 8, 6};

        System.out.println("Missing number from the array is: " + missingNumberFinder(array));
    }

    static int missingNumberFinder(int[] arr) {

        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num + arr[i];
        }
        int expNum = 0;
        for (int j = 1; j <= 10; j++) {
            expNum = expNum + j;
        }
        int mNum = expNum - num;
        return mNum;

    }
}
