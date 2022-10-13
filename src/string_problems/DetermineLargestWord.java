package string_problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    /**
     * INSTRUCTIONS
     * Implement a solution to find the length of the longest word in the given sentence below
     * Your solution should return a map containing the length of the word as the key & the word itself as the value
     * "10: biological"
     */

    public static void main(String[] args) {
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);

        for (String word : wordNLength.values()) {
            s = word.length() + ": " + word;
        }
        System.out.println(s);
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<>();
        String words[] = wordGiven.split(" ");

        // Implement here
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        map.put(longestWord.length(), longestWord);
        return map;
    }
}
