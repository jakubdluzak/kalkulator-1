package kalkulator;

// Import scanner
import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {

        double result = 0;

        // Print kind of operations
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Take from user information what operation user want to do
        System.out.println("Take a kind of operation: ");
        Scanner sc = new Scanner(System.in); 
        int typeOfOperation = sc.nextInt();

        // Take from user information about first number
        System.out.println("Write first number: ");
        double first = sc.nextDouble();

        // Take from user information about second number
        System.out.println("Write second number: ");
        double second = sc.nextDouble();

        // Do operation
        if (typeOfOperation == 1)
            result = first + second;

        if (typeOfOperation == 2)
            result = first - second;

        if (typeOfOperation == 3)
            result = first * second;

        if (typeOfOperation == 4)
            result = first / second;

        // Print result
        System.out.println("Result: " + result);

    }
    
}