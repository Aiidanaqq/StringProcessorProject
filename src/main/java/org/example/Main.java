package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса StringProcessor
        StringProcessor processor = new StringProcessor();

        // Тесты для проверки паролей
        System.out.println("Test 1: Пароль без заглавных букв");
        System.out.println(processor.isStrongPassword("password123!")); // false

        System.out.println("Test 2: Пароль без цифр");
        System.out.println(processor.isStrongPassword("Password!@")); // false

        System.out.println("Test 3: Пароль без спецсимволов");
        System.out.println(processor.isStrongPassword("Password123")); // false

        System.out.println("Test 4: Пароль без строчных букв");
        System.out.println(processor.isStrongPassword("PASSWORD123!")); // false

        System.out.println("Test 5: Сильный пароль");
        System.out.println(processor.isStrongPassword("Password123!")); // true

        // Тесты для подсчета цифр
        System.out.println("Test 1: Строка с цифрами");
        System.out.println(processor.calculateDigits("This is a test 123")); // 3

        System.out.println("Test 2: Строка без цифр");
        System.out.println(processor.calculateDigits("No digits here!")); // 0

        System.out.println("Test 3: Пустая строка");
        System.out.println(processor.calculateDigits("")); // 0

        System.out.println("Test 4: Только цифры");
        System.out.println(processor.calculateDigits("123456789")); // 9

        System.out.println("Test 5: Цифры с символами");
        System.out.println(processor.calculateDigits("!1@2#3$")); // 3

        // Тесты для подсчета слов
        System.out.println("Test 1: Строка с несколькими словами");
        System.out.println(processor.calculateWords("This is a test")); // 4

        System.out.println("Test 2: Пустая строка");
        System.out.println(processor.calculateWords("")); // 0

        System.out.println("Test 3: Строка с множественными пробелами");
        System.out.println(processor.calculateWords("   Too   many   spaces   ")); // 3

        System.out.println("Test 4: Один символ");
        System.out.println(processor.calculateWords(" ")); // 0

        System.out.println("Test 5: Строка с одним словом");
        System.out.println(processor.calculateWords("Word")); // 1

        // Тесты для вычисления выражений
        System.out.println("Test 1: Простое выражение");
        try {
            System.out.println(processor.calculateExpression("2+2")); // 4.0
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Test 2: Сложное выражение с приоритетами");
        try {
            System.out.println(processor.calculateExpression("2+3*4")); // 14.0
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Test 3: Выражение с скобками");
        try {
            System.out.println(processor.calculateExpression("(2+3)*4")); // 20.0
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Test 4: Выражение с делением");
        try {
            System.out.println(processor.calculateExpression("8/2")); // 4.0
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Test 5: Выражение с отрицательными числами");
        try {
            System.out.println(processor.calculateExpression("-3 + 5")); // 2.0
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
