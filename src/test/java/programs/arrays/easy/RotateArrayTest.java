package programs.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateArrayTest {

    RotateArray obj = new RotateArray();

    @Test
    public void testRotateLeftOptimal() {
        int[] arr = {1, 2, 3, 4, 5};
        obj.rotateLeft(arr, 2);
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, arr);
    }

    @Test
    public void testRotateRightOptimal() {
        int[] arr = {1, 2, 3, 4, 5};
        obj.rotateRight(arr, 2);
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, arr);
    }

    @Test
    public void testRotateLeftBrute() {
        int[] arr = {1, 2, 3, 4, 5};
        obj.rotateLeftBrute(arr, 2);
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, arr);
    }

    @Test
    public void testRotateRightBrute() {
        int[] arr = {1, 2, 3, 4, 5};
        obj.rotateRightBrute(arr, 2);
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, arr);
    }

    @Test
    public void testRotateLeftWithKZero() {
        int[] arr = {1, 2, 3};
        obj.rotateLeft(arr, 0);
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }

    @Test
    public void testRotateRightWithKZero() {
        int[] arr = {1, 2, 3};
        obj.rotateRight(arr, 0);
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }

    @Test
    public void testRotateLeftWithKGreaterThanLength() {
        int[] arr = {1, 2, 3, 4, 5};
        obj.rotateLeft(arr, 7); // k % 5 = 2
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, arr);
    }

    @Test
    public void testRotateRightWithKGreaterThanLength() {
        int[] arr = {1, 2, 3, 4, 5};
        obj.rotateRight(arr, 7); // k % 5 = 2
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        obj.rotateLeft(arr, 3);
        assertArrayEquals(new int[]{}, arr);

        obj.rotateRight(arr, 2);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {9};
        obj.rotateLeft(arr, 5);
        assertArrayEquals(new int[]{9}, arr);

        obj.rotateRight(arr, 1);
        assertArrayEquals(new int[]{9}, arr);
    }
}
