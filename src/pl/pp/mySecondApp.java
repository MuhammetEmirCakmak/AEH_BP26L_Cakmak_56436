package pl.pp;

import java.util.Scanner;

public class mySecondApp {
    public static void main(String[] args) {

        // ==================== TASK 1 - Part 1: Name & Surname Input ====================
        // This is a line comment
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your forename:");
        String forename = scanner.nextLine();

        System.out.println("Please enter your surname:");
        String surname = scanner.nextLine();

        System.out.println("Welcome " + forename + " " + surname);

        // ==================== TASK 1 - Part 2: Arithmetic Operations ====================
        double x = 10; // creating a double type variable and assigning it a value of 10
        double y = 2;

        var result = x + y;
        System.out.println("x + y = " + result);

        result = x - y;
        System.out.println("x - y = " + result);

        result = x * y;
        System.out.println("x * y = " + result);

        result = x / y;
        System.out.println("x / y = " + result);

        result = x % y;
        System.out.println("x % y = " + result);

        System.out.println("Enter two numbers separated by the Enter key:");
        double first = scanner.nextDouble(); // request to enter a double value
        double second = scanner.nextDouble();

        System.out.println("x + y = " + (first + second));

        // ==================== TASK 2 - Part 1: Integer x, double and squared ====================
        int intX = 10;
        double doubleX = intX * 2.0;
        double squaredX = (double) intX * intX;

        System.out.println("x = " + intX);
        System.out.println("double of x = " + doubleX);
        System.out.println("x squared = " + squaredX);

        // ==================== TASK 2 - Part 2: Age to Seconds ====================
        scanner = new Scanner(System.in);
        System.out.println("Please enter your age in years:");
        int age = scanner.nextInt();

        long ageInSeconds = (long) age * 365 * 24 * 60 * 60;
        System.out.println("My age in seconds: " + ageInSeconds);

        scanner.close();
    }
}
