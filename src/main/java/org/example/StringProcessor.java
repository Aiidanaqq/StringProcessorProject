package org.example;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class StringProcessor {

    // Проверяет, является ли пароль "сильным"
    public boolean isStrongPassword(String password) {
        return password.matches(".*[A-Z].*") &&       // хотя бы одна заглавная буква
                password.matches(".*[a-z].*") &&       // хотя бы одна строчная буква
                password.matches(".*\\d.*") &&         // хотя бы одна цифра
                password.matches(".*[!@#$%^&*(),.?\":{}|<>\\[\\];'`~=_+-/].*"); // хотя бы один специальный символ
    }

    // Считает количество цифр в предложении
    public int calculateDigits(String sentence) {
        int count = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    // Считает количество слов в предложении
    public int calculateWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    // Вычисляет математическое выражение
    public double calculateExpression(String expression) {
        Expression e = new ExpressionBuilder(expression).build();
        return e.evaluate();
    }
}
