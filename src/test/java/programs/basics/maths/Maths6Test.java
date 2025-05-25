package programs.basics.maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Maths6Test {

    private Maths6 maths;

    @BeforeEach
    void setUp() {
        maths = new Maths6();
    }

    @Test
    void testIsPrime() {
        assertEquals("YES", maths.isPrime(2));
        assertEquals("YES", maths.isPrime(3));
        assertEquals("YES", maths.isPrime(5));
        assertEquals("YES", maths.isPrime(11));
        assertEquals("YES", maths.isPrime(17));
        assertEquals("NO", maths.isPrime(1));
        assertEquals("NO", maths.isPrime(4));
        assertEquals("NO", maths.isPrime(9));
        assertEquals("NO", maths.isPrime(0));
        assertEquals("NO", maths.isPrime(-7));
    }

    @Test
    void testIsPrime2() {
        assertEquals("YES", maths.isPrime2(2));
        assertEquals("YES", maths.isPrime2(3));
        assertEquals("YES", maths.isPrime2(5));
        assertEquals("YES", maths.isPrime2(11));
        assertEquals("YES", maths.isPrime2(17));
        assertEquals("NO", maths.isPrime2(1));
        assertEquals("NO", maths.isPrime2(4));
        assertEquals("NO", maths.isPrime2(9));
        assertEquals("NO", maths.isPrime2(0));
        assertEquals("NO", maths.isPrime2(-7));
    }

    @Test
    void testIsPrime3() {
        assertEquals("YES", maths.isPrime3(2));
        assertEquals("YES", maths.isPrime3(3));
        assertEquals("YES", maths.isPrime3(5));
        assertEquals("YES", maths.isPrime3(11));
        assertEquals("YES", maths.isPrime3(17));
        assertEquals("NO", maths.isPrime3(1));
        assertEquals("NO", maths.isPrime3(4));
        assertEquals("NO", maths.isPrime3(9));
        assertEquals("NO", maths.isPrime3(0));
        assertEquals("NO", maths.isPrime3(-7));
    }
}
