package pl.pp.ex09;

// Example 9: Type Systems
// NOTE: This example intentionally demonstrates a COMPILE-TIME ERROR.
// Java is statically typed - type mismatches are caught at compile time.
// The line below: int x = "Hello"; causes a compile error.
// To demonstrate this concept, the error line is shown as a comment.
public class TypeSystems {
    public static void main(String[] args) {
        // Java is statically typed, meaning types are checked at compile time.

        // The line below would cause a compile-time error:
        // int x = "Hello";  // ERROR: incompatible types: String cannot be converted to int

        // This is a demonstration that the compiler prevents type incompatibilities:
        int x = 42; // valid: assigning an integer to an int variable
        System.out.println("Type Systems example: x = " + x);
        System.out.println("Note: 'int x = \"Hello\"' would cause a compile-time error in Java.");
        System.out.println("Java is statically typed - type mismatches are caught at compile time.");
    }
}
