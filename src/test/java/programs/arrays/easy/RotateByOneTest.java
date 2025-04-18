package programs.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class RotateByOneTest {

    @Test
    public void testRotateNormalArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {2, 3, 4, 5, 1};
        RotateByOne.rotateByOne(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSingleElementArray() {
        int[] input = {42};
        int[] expected = {42};
        RotateByOne.rotateByOne(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testTwoElementArray() {
        int[] input = {9, 10};
        int[] expected = {10, 9};
        RotateByOne.rotateByOne(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        RotateByOne.rotateByOne(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testAlreadyRotatedArray() {
        int[] input = {2, 3, 4, 5, 1};
        int[] expected = {3, 4, 5, 1, 2};
        RotateByOne.rotateByOne(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testNullArray() {
        int[] input = null;
        assertDoesNotThrow(() -> RotateByOne.rotateByOne(input));
    }

}
