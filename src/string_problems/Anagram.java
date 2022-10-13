package string_problems;

import java.util.Scanner;

public class Anagram {

    /**
     * INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     * <p>
     * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     * original letters exactly once.
     * <p>
     * Ex: "CAT" & "ACT",
     * "ARMY" & "MARY",
     * "FART" & "RAFT"
     */

    // Implement Here
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine().toUpperCase();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine().toUpperCase();
        System.out.println();

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are an Anagram");
        } else {
            System.out.println(str1 + " and " + str2 + " are not an Anagram");
        }
    }

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " have to be same length in order to be an Anagram");
            return false;
        }

        int[] arrCount = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            arrCount[str1.charAt(i)]++;
            arrCount[str2.charAt(i)]--;
        }

        for (int j = 0; j < arrCount.length; j++) {
            if (arrCount[j] != 0) {
                return false;
            }
        }
        return true;
    }

}
