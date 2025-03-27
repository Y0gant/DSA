package programs.sorting1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {
    private final InsertionSort sorter = new InsertionSort();

    @Test
    void testEmptyArray() {
        int[] emptyArray = {};
        int[] result = sorter.insertionSort(emptyArray);
        assertArrayEquals(emptyArray, result, "Empty array should remain unchanged");
    }

    @Test
    void testSingleElementArray() {
        int[] singleElementArray = {42};
        int[] result = sorter.insertionSort(singleElementArray);
        assertArrayEquals(singleElementArray, result, "Single element array should remain unchanged");
    }

    @Test
    void testAlreadySortedArray() {
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] result = sorter.insertionSort(sortedArray);
        assertArrayEquals(sortedArray, result, "Already sorted array should remain unchanged");
    }

    @Test
    void testReverseSortedArray() {
        int[] reverseSortedArray = {5, 4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4, 5};
        int[] result = sorter.insertionSort(reverseSortedArray);
        assertArrayEquals(expectedArray, result, "Reverse sorted array should be correctly sorted");
    }

    @Test
    void testArrayWithDuplicates() {
        int[] arrayWithDuplicates = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] expectedArray = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        int[] result = sorter.insertionSort(arrayWithDuplicates);
        assertArrayEquals(expectedArray, result, "Array with duplicates should be correctly sorted");
    }

    @Test
    void testNegativeNumbersArray() {
        int[] negativeNumbersArray = {-5, -2, -8, -1, -9};
        int[] expectedArray = {-9, -8, -5, -2, -1};
        int[] result = sorter.insertionSort(negativeNumbersArray);
        assertArrayEquals(expectedArray, result, "Array with negative numbers should be correctly sorted");
    }

    @Test
    void testMixedPositiveNegativeArray() {
        int[] mixedArray = {-3, 4, 0, -1, 2, -5, 6};
        int[] expectedArray = {-5, -3, -1, 0, 2, 4, 6};
        int[] result = sorter.insertionSort(mixedArray);
        assertArrayEquals(expectedArray, result, "Mixed positive and negative array should be correctly sorted");
    }
}