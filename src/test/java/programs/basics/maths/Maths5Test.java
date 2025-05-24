package programs.basics.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Maths5Test {

    @Test
    public void testSumOfDivisors() {
        Maths5 maths = new Maths5();

        assertEquals(8, maths.sumOfDivisors(3));
        assertEquals(21, maths.sumOfDivisors(5));
        assertEquals(41, maths.sumOfDivisors(7));
    }

    @Test
    public void testSumOfDivisors2() {
        Maths5 maths = new Maths5();

        assertEquals(4, maths.sumOfDivisors2(2));
        assertEquals(8, maths.sumOfDivisors2(3));
    }

    @Test
    public void testSumOfDivisorsComparison() {
        Maths5 maths = new Maths5();

        for (int i = 1; i <= 100; i++) {
            assertEquals(maths.sumOfDivisors(i), maths.sumOfDivisors2(i),
                    "Mismatch at n = " + i);
        }
    }
}
