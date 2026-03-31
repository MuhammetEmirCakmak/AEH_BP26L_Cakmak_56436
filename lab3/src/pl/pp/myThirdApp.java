package pl.pp;

import java.util.Scanner;

public class myThirdApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* ------------------------ TASK 1 (Commented out) ------------------------
        System.out.println("Enter a number greater than 100:");
        // WHILE loop (https://introcs.cs.princeton.edu/java/11cheatsheet/images/while.png)
        var number1 = scanner.nextDouble();
        while (number1 <= 100) {
            System.out.println("The number is not greater than 100, enter again:");
            number1 = scanner.nextDouble();
        }
        System.out.println("Thank you! You’ve entered: " + number1);

        // DO..WHILE loop (https://introcs.cs.princeton.edu/java/11cheatsheet/images/do-while.png)
        double number2;
        do {
            System.out.println("Enter a number greater than 200:");
            number2 = scanner.nextDouble();
        } while (number2 <= 200);
        System.out.println("Thank you! You’ve entered: " + number2);

        // FOR loop (https://introcs.cs.princeton.edu/java/11cheatsheet/images/for.png)
        int wynik = 0;
        for (var i = 1; i <= 10; i++) {
            wynik = wynik + i;
            System.out.println("Iteration no. " + i + " in the for loop, and the result (wynik) = " + wynik);
        }

        // IF..ELSE conditional statements
        System.out.println("Enter the value of x: ");
        var x = scanner.nextDouble();
        System.out.println("Enter the value of y: ");
        var y = scanner.nextDouble();
        if(x > y){
            System.out.println("x is greater than y");
        } else if (x < y) {
            System.out.println("x is smaller than y");
        } else {
            System.out.println("x equals y");
        }

        // terminating the program by pressing a specific key
        while(true) {
            System.out.println("Enter -1 to exit the program");
            var input = scanner.nextDouble();
            if(input == -1){
                System.out.println("Exit...");
                break;
            }
        }
        ------------------------------------------------------------------------- */

        // ------------------------ TASK 2.1 ------------------------
        System.out.println("--- Task 2.1: Days to Weeks Converter ---");
        while (true) {
            System.out.println("Enter the number of days (or a non-positive value like 0 to quit): ");
            int days = scanner.nextInt();

            if (days <= 0) {
                System.out.println("Non-positive value entered. Exiting Task 2.1...");
                break;
            }

            int weeks = days / 7;
            int remainingDays = days % 7;
            System.out.println(days + " days is " + weeks + " weeks and " + remainingDays + " days.");
            System.out.println();
        }

        // ------------------------ TASK 2.2 ------------------------
        System.out.println("\n--- Task 2.2: Temperature Converter ---");
        while (true) {
            System.out.println("Enter the temperature in Celsius (or -1 to quit): ");
            double celsius = scanner.nextDouble();

            if (celsius == -1.0) {
                System.out.println("Exiting Task 2.2...");
                break;
            }

            double fahrenheit = 1.8 * celsius + 32.0;
            double kelvin = celsius + 273.16;

            System.out.printf("Celsius: %.2f\n", celsius);
            System.out.printf("Fahrenheit: %.2f\n", fahrenheit);
            System.out.printf("Kelvin: %.2f\n", kelvin);
            System.out.println();
        }

        scanner.close();
    }
}
