package pl.pp;

public class myFifthApp {

    // Method to calculate factorial iteratively
    public static long factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N cannot be negative");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate factorial recursively
    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N cannot be negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        // Task 2: Remove or "comment out" the previous demonstration code.
        // Previous demonstration code has been removed.

        int n = 15; // The number N provided as an argument
        System.out.println("Calculating factorial for N = " + n);

        // Measure execution time for the iterative method
        long startTimeIterative = System.nanoTime();
        long resultIterative = factorialIterative(n);
        long endTimeIterative = System.nanoTime();
        long executionTimeIterative = endTimeIterative - startTimeIterative;

        System.out.println("Iterative Factorial Result: " + resultIterative);
        System.out.println("Execution time (Iterative): " + executionTimeIterative + " nanoseconds.");

        // Measure execution time for the recursive method
        long startTimeRecursive = System.nanoTime();
        long resultRecursive = factorialRecursive(n);
        long endTimeRecursive = System.nanoTime();
        long executionTimeRecursive = endTimeRecursive - startTimeRecursive;

        System.out.println("Recursive Factorial Result: " + resultRecursive);
        System.out.println("Execution time (Recursive): " + executionTimeRecursive + " nanoseconds.");
    }
}
