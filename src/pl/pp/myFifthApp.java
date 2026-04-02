package pl.pp;

public class myFifthApp {

    // Method to display a character multiple times in a row, for multiple lines
    public static void printCharacter(char character, int charsPerLine, int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < charsPerLine; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Demonstration code from Lab 5 is omitted/removed as per Task 2 instructions.
        
        // Calling the method requested in Task 2
        printCharacter('*', 5, 3);
    }
}
