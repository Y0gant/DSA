package programs.basics.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Maths11Test {

    Maths11 obj = new Maths11();

    @Test
    void testCountPrimesBruteForce() {
        assertEquals(8, obj.countPrimes(2, 20));
        assertEquals(15, obj.countPrimes(2, 50));
        assertEquals(25, obj.countPrimes(2, 100));
    }

    @Test
    void testCountPrimesSievePerNumber() {
        assertEquals(8, obj.countPrimes2(2, 20));
        assertEquals(15, obj.countPrimes2(2, 50));
        assertEquals(25, obj.countPrimes2(2, 100));
    }

    @Test
    void testCountPrimesWithPrefixSum() {
        assertEquals(8, obj.countPrimes3(2, 20));
        assertEquals(15, obj.countPrimes3(2, 50));
        assertEquals(25, obj.countPrimes3(2, 100));
    }

    @Test
    void testInvalidInputs() {
        assertEquals(0, obj.countPrimes(-1, 10));
        assertEquals(0, obj.countPrimes2(0, 0));
        assertEquals(0, obj.countPrimes3(50, 10));
    }

    @Test
    void testEdgeCases() {
        assertEquals(0, obj.countPrimes(0, 1));
        assertEquals(0, obj.countPrimes2(0, 1));
        assertEquals(0, obj.countPrimes3(0, 1));
    }
}
