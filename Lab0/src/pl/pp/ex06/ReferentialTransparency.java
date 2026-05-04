package pl.pp.ex06;

// Example 6: Referential Transparency
public class ReferentialTransparency {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        int result1 = add(x, y); // result1 = 7
        int result2 = x + y;     // result2 = 7

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
