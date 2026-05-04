package pl.pp.ex01;

import java.util.function.Function;

// Example 1: First-Class Functions
public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleValue = x -> x * 2;
        Function<Integer, Integer> squareValue = x -> x * x;

        int result1 = doubleValue.apply(5); // result1 = 10
        int result2 = squareValue.apply(5); // result2 = 25

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
