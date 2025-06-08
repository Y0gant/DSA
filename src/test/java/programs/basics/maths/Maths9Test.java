package programs.basics.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Maths9Test {

    @Test
    void testPower() {
        Maths9 obj = new Maths9();

        assertEquals(1, obj.power(2, 0));
        assertEquals(2, obj.power(2, 1));
        assertEquals(4, obj.power(2, 2));
        assertEquals(8, obj.power(2, 3));
        assertEquals(16, obj.power(2, 4));
        assertEquals(0, obj.power(2, -2));  // Due to integer division: 1 / 4 = 0
    }

    @Test
    void testPowerBrute() {
        Maths9 obj = new Maths9();

        assertEquals(1, obj.powerBrute(2, 0));
        assertEquals(2, obj.powerBrute(2, 1));
        assertEquals(4, obj.powerBrute(2, 2));
        assertEquals(8, obj.powerBrute(2, 3));
        assertEquals(16, obj.powerBrute(2, 4));
        assertEquals(0, obj.powerBrute(2, -2));  // Again, integer division
    }

    @Test
    void testNegativeBase() {
        Maths9 obj = new Maths9();

        assertEquals(-8, obj.power(-2, 3));
        assertEquals(16, obj.power(-2, 4));

        assertEquals(-8, obj.powerBrute(-2, 3));
        assertEquals(16, obj.powerBrute(-2, 4));
    }

    @Test
    void testEdgeCases() {
        Maths9 obj = new Maths9();

        assertEquals(1, obj.power(0, 0));     // Typically defined as 1
        assertEquals(0, obj.power(0, 5));
        assertEquals(0, obj.powerBrute(0, 5));

        assertEquals(1, obj.power(1, -100));  // 1 to any power is still 1
        assertEquals(1, obj.powerBrute(1, -100));
    }
}
