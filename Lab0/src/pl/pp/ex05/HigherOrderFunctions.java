package pl.pp.ex05;

import java.util.function.Function;

// Example 5: Higher-Order Functions & Function Composition
public class HigherOrderFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> addOne =
                x -> x + 1;
        Function<Integer, Integer> multiplyByTwo =
                x -> x * 2;

        Function<Integer, Integer> composedFunction =
                addOne.andThen(multiplyByTwo);
        // result = (4 + 1) * 2 = 12
        int result = composedFunction.apply(4);
        System.out.println("Result: " + result);
    }
}
