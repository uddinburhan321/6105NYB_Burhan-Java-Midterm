package string_problems;

public class DuplicateWord {

    /**
     * INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // Implement here

        int count;
        st = st.toUpperCase();
        String words[] = st.replaceAll("[.|,]", "").split(" ");

        System.out.println("Duplicate words and their number of occurrences : \n");

        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1 && words[i] != "0")
                System.out.println("## \"" + words[i] + "\" duplicated " + count + " Times");
        }
        System.out.println("\n## Average length of the words : " + words.length);
    }
}
