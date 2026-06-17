package pl.pp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class myThirteenthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Path inputPath = askForExistingInputFile(scanner);
        System.out.print("Enter output file path: ");
        Path outputPath = Path.of(readPath(scanner));

        try {
            String content = Files.readString(inputPath);
            Map<String, Integer> wordOccurrences = countWords(content);
            int totalWords = wordOccurrences.values()
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            String report = buildReport(inputPath, totalWords, wordOccurrences);

            System.out.println(report);
            Files.writeString(outputPath, report);
            System.out.println("Results saved to: " + outputPath);
        } catch (IOException e) {
            System.out.println("An error occurred while processing files: " + e.getMessage());
        }
    }

    private static Path askForExistingInputFile(Scanner scanner) {
        while (true) {
            System.out.print("Enter input file path: ");
            Path inputPath = Path.of(readPath(scanner));

            if (Files.exists(inputPath) && Files.isRegularFile(inputPath)) {
                return inputPath;
            }

            System.out.println("Input file does not exist. Please provide another file.");
        }
    }

    private static String readPath(Scanner scanner) {
        String path = scanner.nextLine().trim().replace("\uFEFF", "");

        if (path.length() >= 2 && path.startsWith("\"") && path.endsWith("\"")) {
            path = path.substring(1, path.length() - 1);
        }

        return path;
    }

    private static Map<String, Integer> countWords(String content) {
        Map<String, Integer> wordOccurrences = new LinkedHashMap<>();
        String[] words = content.toLowerCase().split("[^\\p{L}\\p{N}']+");

        for (String word : words) {
            if (!word.isBlank()) {
                wordOccurrences.merge(word, 1, Integer::sum);
            }
        }

        return wordOccurrences;
    }

    private static String buildReport(
            Path inputPath,
            int totalWords,
            Map<String, Integer> wordOccurrences) {
        StringBuilder report = new StringBuilder();
        report.append("Input file: ").append(inputPath.getFileName()).append(System.lineSeparator());
        report.append("Total words: ").append(totalWords).append(System.lineSeparator());
        report.append("Word occurrences:").append(System.lineSeparator());

        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            report.append(entry.getKey())
                    .append(": ")
                    .append(entry.getValue())
                    .append(System.lineSeparator());
        }

        return report.toString();
    }
}
