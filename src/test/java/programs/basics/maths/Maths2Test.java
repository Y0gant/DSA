package programs.basics.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Maths2Test {

    Maths2 obj = new Maths2();

    @Test
    void reverse2_IntegerMinValue() {
        assertEquals(0, obj.reverse2(-2147483648));
    }

    @Test
    void reverse2_IntegerMaxValue() {
        assertEquals(0, obj.reverse2(2147483647));
    }

    @Test
    void reverse2_Zero() {
        assertEquals(0, obj.reverse2(0));
    }

    @Test
    void reverse2_Positive() {
        assertEquals(98, obj.reverse2(89));
    }

    @Test
    void reverse2_Negative() {
        assertEquals(-28, obj.reverse2(-82));
    }

    @Test
    void reverse2_SingleDigit() {
        assertEquals(5, obj.reverse2(5));
        assertEquals(-3, obj.reverse2(-3));
    }

    @Test
    void reverse2_WithTrailingZeros() {
        assertEquals(321, obj.reverse2(123000));
        assertEquals(-321, obj.reverse2(-123000));
    }

    @Test
    void reverse2_PalindromeNumber() {
        assertEquals(121, obj.reverse2(121));
        assertEquals(-121, obj.reverse2(-121));
    }

    @Test
    void reverse2_OverflowAfterReverse() {
        assertEquals(0, obj.reverse2(1534236469));
    }

    @Test
    void reverse2_UnderflowAfterReverse() {
        assertEquals(0, obj.reverse2(-1563847412));
    }

    @Test
    void reverse2_MultipleZerosInMiddle() {
        assertEquals(1032, obj.reverse2(2301));
    }

    @Test
    void reverse2_LargeNegative() {
        assertEquals(-1463847412, obj.reverse2(-2147483641));
    }
}