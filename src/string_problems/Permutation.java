package string_problems;

import java.util.Scanner;

public class Permutation {

    /**
     * INSTRUCTIONS
     * Create a Java program to compute all permutations of any given string
     * <p>
     * e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);

        System.out.print("Enter any String to compute all possible Permutations: ");
        String str = k.nextLine();

        System.out.println("\nAll possible Permutations are : \n");
        strPermutation(str.toUpperCase(), "\t");
    }
    // Implement Here

    static void strPermutation(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String str1 = str.substring(0, i) + str.substring(i + 1);
            strPermutation(str1, result + ch);
        }
    }
}
