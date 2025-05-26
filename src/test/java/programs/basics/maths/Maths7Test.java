package programs.basics.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Maths7Test {

    Maths7 maths = new Maths7();

    @Test
    void testGcd_CommonCases() {
        assertEquals(10, maths.gcd(10, 20));
        assertEquals(20, maths.gcd(20, 40));
        assertEquals(1, maths.gcd(9, 14));
    }

    @Test
    void testGcd_EdgeCases() {
        assertEquals(1, maths.gcd(1, 1));
        assertEquals(1, maths.gcd(1, 999));
        assertEquals(999, maths.gcd(999, 0));
        assertEquals(999, maths.gcd(0, 999));
    }

    @Test
    void testLcmAndGcd_CommonCases() {
        assertArrayEquals(new int[]{20, 10}, maths.lcmAndGcd(10, 20));
        assertArrayEquals(new int[]{40, 20}, maths.lcmAndGcd(20, 40));
        assertArrayEquals(new int[]{126, 1}, maths.lcmAndGcd(9, 14));
    }

    @Test
    void testLcmAndGcd_EdgeCases() {
        assertArrayEquals(new int[]{1, 1}, maths.lcmAndGcd(1, 1));
        assertArrayEquals(new int[]{999, 1}, maths.lcmAndGcd(1, 999));
    }
}
