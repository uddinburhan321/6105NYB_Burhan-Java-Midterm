package math_problems;

public class Pattern {

    /**
     * INSTRUCTIONS
     * Read the numbers below, identify the pattern, and then implement the logic from this pattern.
     * Once done, you should test to see if you get the same output as below:
     * <p>
     * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32,28,24,20,16,12,8,4,0
     */

    public static void main(String[] args) {
        findPattern();

    }

    static void findPattern() {
        int startingNumber = 100;
        System.out.print(startingNumber + ", ");
        for (int i = 10; i <= 40; i += 10) {
            int subtractBy = i / 10;
            for (int j = 0; j < 10; j++) {
                startingNumber = startingNumber - subtractBy;
                System.out.print(startingNumber + ", ");
            }
        }
        System.out.println("\b\b");
    }
}
