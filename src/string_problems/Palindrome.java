package string_problems;

import java.util.Scanner;

public class Palindrome {

    /**
     * INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     * <p>
     * Example: MOM, DAD, MADAM, RACECAR
     * <p>
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);

        System.out.print("Enter any word to check if it is Palindrome: ");
        String str = k.nextLine().toUpperCase();
        System.out.println();

        if (isPalindrome(str)) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not Palindrome");
        }
    }
    // Implement here

    public static boolean isPalindrome(String str) {

        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
