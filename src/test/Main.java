package org.example;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();
        Scanner scanner = new Scanner(System.in);

        // Test isStrongPassword
        System.out.println("Enter a password to check if it's strong:");
        String password = scanner.nextLine();
        boolean isStrong = processor.isStrongPassword(password);
        System.out.println("Is the password strong? " + isStrong);

        // Test calculateDigits
        System.out.println("Enter a sentence to calculate digits:");
        String sentence = scanner.nextLine();
        int digitCount = processor.calculateDigits(sentence);
        System.out.println("Number of digits: " + digitCount);

        // Test calculateWords
        System.out.println("Enter a sentence to calculate words:");
        String sentenceForWords = scanner.nextLine();
        int wordCount = processor.calculateWords(sentenceForWords);
        System.out.println("Number of words: " + wordCount);

        // Test calculateExpression
        System.out.println("Enter a mathematical expression to evaluate (e.g., 3+5*2):");
        String expression = scanner.nextLine();
        double result = processor.calculateExpression(expression);
        System.out.println("Result of the expression: " + result);

        scanner.close();
    }
}
