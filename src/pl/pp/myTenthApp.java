package pl.pp;

import java.util.Arrays;

public class myTenthApp {
    public static void main(String[] args) {
        System.out.println("Hello Basics of Programming!");
        
        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};
        int[] result = countAndSumElements(input);
        System.out.println(Arrays.toString(result));
    }

    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) return new int[0];
        int negCount = 0;
        int posSum = 0;
        for (int n : input) {
            if (n < 0) negCount++;
            else if (n > 0) posSum += n;
        }
        return new int[]{negCount, posSum};
    }
}
