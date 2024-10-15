package org.example;

public class Main {
    public static void main(String[] args) {
        // Create an object of the StringProcessor class
        StringProcessor processor = new StringProcessor();

        // Tests for password checks
        System.out.println("Test 1: Password without uppercase letters");
        System.out.println(processor.isStrongPassword("password123!")); // false

        System.out.println("Test 2: Password without digits");
        System.out.println(processor.isStrongPassword("Password!@")); // false

        System.out.println("Test 3: Password without special symbols");
        System.out.println(processor.isStrongPassword("Password123")); // false

        System.out.println("Test 4: Password without lowercase letters");
        System.out.println(processor.isStrongPassword("PASSWORD123!")); // false

        System.out.println("Test 5: Strong password");
        System.out.println(processor.isStrongPassword("Password123!")); // true

        // Tests for counting digits
        System.out.println("Test 1: String with digits");
        System.out.println(processor.calculateDigits("This is a test 123")); // 3

        System.out.println("Test 2: String without digits");
        System.out.println(processor.calculateDigits("No digits here!")); // 0

        System.out.println("Test 3: Empty string");
        System.out.println(processor.calculateDigits("")); // 0

        System.out.println("Test 4: Only digits");
        System.out.println(processor.calculateDigits("123456789")); // 9

        System.out.println("Test 5: Digits with symbols");
        System.out.println(processor.calculateDigits("!1@2#3$")); // 3

        // Tests for counting words
        System.out.println("Test 1: String with multiple words");
        System.out.println(processor.calculateWords("This is a test")); // 4

        System.out.println("Test 2: Empty string");
        System.out.println(processor.calculateWords("")); // 0

        System.out.println("Test 3: String with multiple spaces");
        System.out.println(processor.calculateWords("   Too   many   spaces   ")); // 3

        System.out.println("Test 4: One character");
        System.out.println(processor.calculateWords(" ")); // 0

        System.out.println("Test 5: String with one word");
        System.out.println(processor.calculateWords("Word")); // 1

        // Tests for calculating expressions
        System.out.println("Test 1: Simple expression");
        try {
            System.out.println(processor.calculateExpression("2+2")); // 4.0
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Test 2: Complex expression with priorities");
        try {
            System.out.println(processor.calculateExpression("2+3*4")); // 14.0
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Test 3: Expression with parentheses");
        try {
            System.out.println(processor.calculateExpression("(2+3)*4")); // 20.0
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Test 4: Expression with division");
        try {
            System.out.println(processor.calculateExpression("8/2")); // 4.0
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Test 5: Expression with negative numbers");
        try {
            System.out.println(processor.calculateExpression("-3 + 5")); // 2.0
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
