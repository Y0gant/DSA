package programs.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LargestElementInAnArrayTest {

    @Test
    void testNormalArray() {
        int[] arr = {345, 678, 123, 876, 432};
        assertEquals(876, LargestElementInAnArray.largestElement(arr));
        assertEquals(876, LargestElementInAnArray.largestElement2(arr));
    }

    @Test
    void testLargestAtBeginning() {
        int[] arr = {999, 678, 123, 876, 432};
        assertEquals(999, LargestElementInAnArray.largestElement(arr));
        assertEquals(999, LargestElementInAnArray.largestElement2(arr));
    }

    @Test
    void testLargestAtEnd() {
        int[] arr = {345, 678, 123, 876, 1000};
        assertEquals(1000, LargestElementInAnArray.largestElement(arr));
        assertEquals(1000, LargestElementInAnArray.largestElement2(arr));
    }

    @Test
    void testSingleElementArray() {
        int[] arr = {42};
        assertEquals(42, LargestElementInAnArray.largestElement(arr));
        assertEquals(42, LargestElementInAnArray.largestElement2(arr));
    }

    @Test
    void testAllEqualElements() {
        int[] arr = {77, 77, 77, 77, 77};
        assertEquals(77, LargestElementInAnArray.largestElement(arr));
        assertEquals(77, LargestElementInAnArray.largestElement2(arr));
    }

    @Test
    void testNegativeNumbers() {
        int[] arr = {-10, -5, -20, -3, -7};
        assertEquals(-3, LargestElementInAnArray.largestElement(arr));
        assertEquals(-3, LargestElementInAnArray.largestElement2(arr));
    }

    @Test
    void testMixedPositiveAndNegative() {
        int[] arr = {-10, 5, -20, 3, -7};
        assertEquals(5, LargestElementInAnArray.largestElement(arr));
        assertEquals(5, LargestElementInAnArray.largestElement2(arr));
    }

    @Test
    void testLargeArray() {
        // Create a large array with a known maximum
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        arr[500] = 10000; // Set the maximum value

        assertEquals(10000, LargestElementInAnArray.largestElement(arr));
        assertEquals(10000, LargestElementInAnArray.largestElement2(arr));
    }

    @Test
    void testArrayWithDuplicateMaxValues() {
        int[] arr = {100, 200, 300, 300, 200, 100};
        assertEquals(300, LargestElementInAnArray.largestElement(arr));
        assertEquals(300, LargestElementInAnArray.largestElement2(arr));
    }

    @Test
    void testEmptyArray() {
        int[] emptyArray = {};

        // Both methods should throw ArrayIndexOutOfBoundsException for empty arrays
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            LargestElementInAnArray.largestElement(emptyArray);
        });

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            LargestElementInAnArray.largestElement2(emptyArray);
        });
    }
}