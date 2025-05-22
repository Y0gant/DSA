package programs.basics.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Maths3Test {

    Maths3 maths = new Maths3();

    @Test
    void testPositivePalindrome() {
        assertTrue(maths.isPalindrome(121));
    }

    @Test
    void testNegativeNumber() {
        assertFalse(maths.isPalindrome(-121));
    }

    @Test
    void testZero() {
        assertTrue(maths.isPalindrome(0));
    }

    @Test
    void testNonPalindrome() {
        assertFalse(maths.isPalindrome(123));
    }

    @Test
    void testLargePalindrome() {
        assertTrue(maths.isPalindrome(1000000001));
    }

    @Test
    void testSingleDigit() {
        assertTrue(maths.isPalindrome(7));
    }

    @Test
    void testTrailingZero() {
        assertFalse(maths.isPalindrome(10));
    }

    @Test
    void testMaxIntPalindrome() {
        assertTrue(maths.isPalindrome(2147447412));
    }
}
