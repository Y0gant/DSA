package programs.basics.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Maths4Test {

    Maths4 obj = new Maths4();

    @Test
    void testValidArmstrongNumbers() {
        assertTrue(obj.armstrongNumber(0));
        assertTrue(obj.armstrongNumber(1));
        assertTrue(obj.armstrongNumber(153));
        assertTrue(obj.armstrongNumber(9474));
        assertTrue(obj.armstrongNumber(1634));
        assertTrue(obj.armstrongNumber(9474));
        assertTrue(obj.armstrongNumber(548834));
    }

    @Test
    void testInvalidArmstrongNumbers() {
        assertFalse(obj.armstrongNumber(10));
        assertFalse(obj.armstrongNumber(100));
        assertFalse(obj.armstrongNumber(200));
        assertFalse(obj.armstrongNumber(123));
        assertFalse(obj.armstrongNumber(999));
    }

    @Test
    void testNegativeNumbers() {
        assertFalse(obj.armstrongNumber(-1));
        assertFalse(obj.armstrongNumber(-153));
        assertFalse(obj.armstrongNumber(-9474));
    }

    @Test
    void testLargeNumbers() {
        assertFalse(obj.armstrongNumber(9999999));
        assertFalse(obj.armstrongNumber(Integer.MAX_VALUE));
    }
}
