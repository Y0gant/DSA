package programs.basics.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Maths1Test {

    @Test
    void testCountDigitsBrute_withPositiveNumber() {
        Maths1 obj = new Maths1();
        assertEquals(6, obj.countDigitsBrute(748682));
    }

    @Test
    void testCountDigitsBrute_withNegativeNumber() {
        Maths1 obj = new Maths1();
        assertEquals(6, obj.countDigitsBrute(-123456));
    }

    @Test
    void testCountDigitsBrute_withZero() {
        Maths1 obj = new Maths1();
        assertEquals(1, obj.countDigitsBrute(0));
    }

    @Test
    void testCountDigits_withPositiveNumber() {
        Maths1 obj = new Maths1();
        assertEquals(8, obj.countDigits(62876438));
    }

    @Test
    void testCountDigits_withNegativeNumber() {
        Maths1 obj = new Maths1();
        assertEquals(5, obj.countDigits(-12345));
    }


}
