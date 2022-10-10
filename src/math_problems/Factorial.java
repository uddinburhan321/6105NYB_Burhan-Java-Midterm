package math_problems;

import java.util.Scanner;

public class Factorial {

    /**
     * INSTRUCTIONS
     * <p>
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     * <p>
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    static Scanner scanner = new Scanner(System.in);
    static int input;
    static int factorial;
    static int total = 1;
    static String response;

    public static void main(String[] args) {

        //Factorial Using Recursion.
        System.out.print("Enter a positive number: ");
        input = scanner.nextInt();
        System.out.println("\nFactorial using Recursion: Factorial of " + input + "! = " + factorialUsingRecursion(input));
        factorialUsingRecursion(3);
        System.out.println("\nFactorial using Iteration:\n");

        //Factorial Using Iteration
        factorialUsingIteration(input);
    }

    static int factorialUsingRecursion(int input) {
        if (input == 1 || input == 0)
            return 1;
        if (input < 0)
            return -1;
        else
            factorial = (input * factorialUsingRecursion(input - 1));
        return factorial;
    }

    static int factorialUsingIteration(int input) {

        System.out.println("Hello! Would you like to try our factorial calculator?");
        response = scanner.next();

        while (true) {
            if (response.equalsIgnoreCase("yes") || (response.equalsIgnoreCase("y"))) {

                System.out.println("\nRemember to enter positive integers only, (Negative)integers will terminate the execution");
                System.out.print("What number would you like to find the factorial of: ");
                input = scanner.nextInt();
                System.out.println();
                if (input < 0) {
                    System.out.println("\nThanks for trying our factorial calculator!");
                    break;
                } else if (input == 1 || input == 0) {
                    System.out.print(input + "! = " + total + "\n");
                } else {
                    System.out.print(input + "! =");
                    for (int i = input; i > 0; i--) {
                        total = total * i;
                        System.out.print(" " + i + " * \b");
                    }
                    System.out.println("\b= " + total);
                    total = 1;
                }
            } else if (response.equalsIgnoreCase("no") || (response.equalsIgnoreCase("n"))) {
                System.out.println("\nHave a nice day!");
                break;
            }
        }
        scanner.close();
        return total;
    }

}
