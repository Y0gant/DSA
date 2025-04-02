package programs.sorting2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortTest {

    MergeSort merger = new MergeSort();

    @Test
    void testMergeSortWithSmallArray() {
        int[] arr = {23, 98, 12, 67, 45, 89, 34, 76, 56, 10};
        int[] expected = {10, 12, 23, 34, 45, 56, 67, 76, 89, 98};

        assertArrayEquals(expected, merger.mergeSort(arr, 0, arr.length - 1));
    }

    @Test
    void testMergeSortWithLargerArray() {
        int[] arr = {345, 678, 123, 876, 432, 567, 234, 789, 987, 345};
        int[] expected = {123, 234, 345, 345, 432, 567, 678, 789, 876, 987};

        assertArrayEquals(expected, merger.mergeSort(arr, 0, arr.length - 1));
    }

    @Test
    void testMergeSortWithDuplicates() {
        int[] arr = {4, 2, 4, 2, 1, 3, 3, 1, 5};
        int[] expected = {1, 1, 2, 2, 3, 3, 4, 4, 5};

        assertArrayEquals(expected, merger.mergeSort(arr, 0, arr.length - 1));
    }

    @Test
    void testMergeSortWithEmptyArray() {
        int[] arr = {};
        int[] expected = {};

        assertArrayEquals(expected, merger.mergeSort(arr, 0, arr.length - 1));
    }

    @Test
    void testMergeSortWithSingleElement() {
        int[] arr = {42};
        int[] expected = {42};

        assertArrayEquals(expected, merger.mergeSort(arr, 0, arr.length - 1));
    }

    @Test
    void testMergeSortWithAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertArrayEquals(expected, merger.mergeSort(arr, 0, arr.length - 1));
    }

    @Test
    void testMergeSortWithReverseSortedArray() {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertArrayEquals(expected, merger.mergeSort(arr, 0, arr.length - 1));
    }
}
