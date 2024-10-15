package org.example;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class StringProcessor {

    // Checks if the password is "strong"
    public boolean isStrongPassword(String password) {
        return password.matches(".*[A-Z].*") &&       // at least one uppercase letter
                password.matches(".*[a-z].*") &&       // at least one lowercase letter
                password.matches(".*\\d.*") &&         // at least one digit
                password.matches(".*[!@#$%^&*(),.?\":{}|<>\\[\\];'`~=_+-/].*"); // at least one special symbol
    }

    // Counts the number of digits in the given sentence
    public int calculateDigits(String sentence) {
        int count = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    // Counts the number of words in the given sentence
    public int calculateWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    // Calculates the mathematical expression
    public double calculateExpression(String expression) {
        Expression e = new ExpressionBuilder(expression).build();
        return e.evaluate();
    }
}
