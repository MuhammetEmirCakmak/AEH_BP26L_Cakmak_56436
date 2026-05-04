package pl.pp.ex04;

// Example 4: Recursion
public class RecursionExample {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = factorial(5); // result = 120
        System.out.println("Factorial of 5: " + result);
    }
}
