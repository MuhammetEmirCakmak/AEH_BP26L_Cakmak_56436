package pl.pp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class myTwelfthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File inputFile = null;

        System.out.println("Welcome to the line counting application.");

        // Ask for an input file until a valid, existing file is provided
        while (inputFile == null || !inputFile.exists() || !inputFile.isFile()) {
            System.out.print("Please enter the path to the input text file: ");
            String inputPath = scanner.nextLine();
            inputFile = new File(inputPath);

            if (!inputFile.exists()) {
                System.out.println("Error: The file does not exist. Please try again.");
            } else if (!inputFile.isFile()) {
                System.out.println("Error: The provided path is not a file. Please try again.");
            }
        }

        System.out.print("Please enter the path to the output text file: ");
        String outputPath = scanner.nextLine();
        File outputFile = new File(outputPath);

        int lineCount = 0;

        // Read the input file and count its lines
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("The input file has " + lineCount + " lines.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the input file: " + e.getMessage());
            scanner.close();
            return;
        }

        // Save the results to the output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("File name: " + inputFile.getName() + "\n");
            writer.write("Number of lines: " + lineCount + "\n");
            System.out.println("Results successfully saved to " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the output file: " + e.getMessage());
        }

        scanner.close();
    }
}
