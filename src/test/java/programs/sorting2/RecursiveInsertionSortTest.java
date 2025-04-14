package programs.sorting2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RecursiveInsertionSortTest {

    private RecursiveInsertionSort sorter;

    @BeforeEach
    void setUp() {
        sorter = new RecursiveInsertionSort();
    }

    @Test
    @DisplayName("Sort an already sorted array")
    void testSortAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        sorter.recursiveInsertionSort(arr, 1, arr.length);

        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Sort an array in reverse order")
    void testSortReverseOrderArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};

        sorter.recursiveInsertionSort(arr, 1, arr.length);

        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Sort an array with duplicate elements")
    void testSortArrayWithDuplicates() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        int[] expected = {1, 1, 2, 3, 4, 5, 5, 6, 9};

        sorter.recursiveInsertionSort(arr, 1, arr.length);

        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Sort an empty array")
    void testSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};

        sorter.recursiveInsertionSort(arr, 1, arr.length);

        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Sort an array with a single element")
    void testSortSingleElementArray() {
        int[] arr = {42};
        int[] expected = {42};

        sorter.recursiveInsertionSort(arr, 1, arr.length);

        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Sort a large array with random elements")
    void testSortLargeRandomArray() {
        int[] arr = {934, 482, 120, 985, 347, 658, 218, 749, 830, 121,
                992, 563, 710, 425, 388, 640, 923, 571, 268, 348};

        // Make a copy of the array to verify sorting
        int[] copy = new int[arr.length];
        System.arraycopy(arr, 0, copy, 0, arr.length);
        java.util.Arrays.sort(copy);

        sorter.recursiveInsertionSort(arr, 1, arr.length);

        assertArrayEquals(copy, arr);
    }

    @Test
    @DisplayName("Sort a small array with negative numbers")
    void testSortArrayWithNegativeNumbers() {
        int[] arr = {-5, 12, -3, 0, -8, 7};
        int[] expected = {-8, -5, -3, 0, 7, 12};

        sorter.recursiveInsertionSort(arr, 1, arr.length);

        assertArrayEquals(expected, arr);
    }
    
    @Test
    @DisplayName("Performance test with a large array")
    void testPerformanceWithLargeArray() {
        // Generate a large array with 1000 random elements
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }

        // Make a copy of the array to verify sorting
        int[] copy = new int[arr.length];
        System.arraycopy(arr, 0, copy, 0, arr.length);
        java.util.Arrays.sort(copy);

        sorter.recursiveInsertionSort(arr, 1, arr.length);

        assertArrayEquals(copy, arr);
    }

    @Test
    @DisplayName("Test with all identical elements")
    void testAllIdenticalElements() {
        int[] arr = {42, 42, 42, 42, 42};
        int[] expected = {42, 42, 42, 42, 42};

        sorter.recursiveInsertionSort(arr, 1, arr.length);

        assertArrayEquals(expected, arr);
    }
}