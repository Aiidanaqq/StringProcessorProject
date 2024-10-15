import org.example.StringProcessor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class StringProcessorTest {

    StringProcessor processor = new StringProcessor();
    @Test
    void testIsStrongPassword() {
        assertTrue(processor.isStrongPassword("Password123!")); // true
        assertFalse(processor.isStrongPassword("password123!")); // false
        assertFalse(processor.isStrongPassword("Password!")); // false
        assertFalse(processor.isStrongPassword("Password123")); // false
        assertFalse(processor.isStrongPassword("PASSWORD123!")); // false
    }
    @Test
    void testCalculateDigits() {
        // Test calculateDigits
        assertEquals(3, processor.calculateDigits("This is a test 123")); // 3
        assertEquals(0, processor.calculateDigits("No digits here!")); // 0
        assertEquals(0, processor.calculateDigits("")); // 0
        assertEquals(9, processor.calculateDigits("123456789")); // 9
        assertEquals(3, processor.calculateDigits("!1@2#3$")); // 3
    }
    @Test
    void testCalculateWords() {
        // Test calculateWords
        assertEquals(4, processor.calculateWords("This is a test")); // 4
        assertEquals(0, processor.calculateWords("")); // 0
        assertEquals(3, processor.calculateWords("   Too   many   spaces   ")); // 3
        assertEquals(1, processor.calculateWords(" ")); // 1
        assertEquals(1, processor.calculateWords("Word")); // 1
    }
    @Test
    void testCalculateExpresion(){
        assertEquals(4.0, processor.calculateExpression("2+2"), 0.001); // 4.0
        assertEquals(14.0, processor.calculateExpression("2+3*4"), 0.001); // 14.0
        assertEquals(20.0, processor.calculateExpression("(2+3)*4"), 0.001); // 20.0
        assertEquals(4.0, processor.calculateExpression("8/2"), 0.001); // 4.0
        assertEquals(2.0, processor.calculateExpression("-3 + 5"), 0.001); // 2.0
    }
}
