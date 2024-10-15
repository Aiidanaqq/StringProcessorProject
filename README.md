Description


This project contains a Java class named StringProcessor, which includes various string processing methods:

1.isStrongPassword(String password):



Checks if the provided password is strong.
A strong password must contain at least one uppercase letter, one lowercase letter, one digit, and one special symbol.
Returns true if the password is strong; otherwise, returns false.
calculateDigits(String sentence):

Counts the number of digits in the given sentence.
Returns the count of digits.


2.calculateWords(String sentence):



Calculates the number of words in the given sentence.
Words are considered separated by spaces.
Returns the count of words.


3.calculateExpression(String expression):



Given a string containing an expression with numbers, arithmetic operations, and brackets.
Calculates and returns the result of the expression.
Testing
The project includes various test cases to ensure the functionality of the methods:

Password Testing
Test with passwords lacking uppercase letters, digits, special symbols, and those that meet all criteria.
Digit Counting Testing
Test with strings containing digits and those without any digits.
Word Counting Testing
Test with strings containing multiple words, empty strings, and strings with excessive spaces.
Expression Evaluation Testing
Test with simple arithmetic expressions, expressions with brackets, and more complex expressions involving different operations.
