package math_problems;

import java.util.Scanner;

public class Fibonacci {

    /**
     * INSTRUCTIONS
     * <p>
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static void main(String[] args) {
        fibonacciNumber();
    }

    static void fibonacciNumber() {

        int num, firstNum = 0, secondNum = 1, nextNum;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number you would like to find the fibonacci series up to: ");
        num = scanner.nextInt();

        System.out.print("\nFibonacci Series Up to " + num + " is: ");

        while (firstNum <= num) {
            System.out.print(firstNum + ", ");
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
        System.out.print("\b\b\n");
    }
}
