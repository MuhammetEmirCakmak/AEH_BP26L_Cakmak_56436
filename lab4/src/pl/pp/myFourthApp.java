package pl.pp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class myFourthApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ======================== TASK 2.1 ========================
        System.out.println("--- Task 2.1: Sum of Squares ---");
        boolean firstTime = true;
        while (true) {
            try {
                if (firstTime) {
                    System.out.print("Enter lower and upper integer limits: ");
                } else {
                    System.out.print("Enter next set of limits: ");
                }

                int lower = scanner.nextInt();
                int upper = scanner.nextInt();

                if (upper <= lower) {
                    System.out.println("Done");
                    break;
                }

                int sum = 0;
                for (int i = lower; i <= upper; i++) {
                    sum += (i * i);
                }

                int lowerSquare = lower * lower;
                int upperSquare = upper * upper;
                System.out.println("The sums of the squares from " + lowerSquare + " to " + upperSquare + " is " + sum);
                
                firstTime = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integer numbers.");
                scanner.nextLine(); // Clear the buffer
            }
        }

        // ======================== TASK 2.2 ========================
        System.out.println("\n--- Task 2.2: Simple Calculator ---");
        while (true) {
            System.out.println("\nMenu Options:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Select an option (1-5): ");

            String option = scanner.next();

            if (option.equals("5")) {
                System.out.println("Exiting calculator...");
                break;
            }

            if (!option.equals("1") && !option.equals("2") && !option.equals("3") && !option.equals("4")) {
                System.out.println("Invalid option. Please choose 1, 2, 3, 4, or 5.");
                continue;
            }

            double num1 = 0;
            double num2 = 0;
            boolean validNumbers = false;

            while (!validNumbers) {
                try {
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    validNumbers = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter numbers only.");
                    scanner.nextLine(); // Clear the buffer
                }
            }

            switch (option) {
                case "1":
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case "2":
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case "3":
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case "4":
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
            }
        }

        scanner.close();
    }
}
