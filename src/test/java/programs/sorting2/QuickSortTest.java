package programs.sorting2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {

    QuickSort sorter = new QuickSort();

    void sortAndAssert(int[] input, int[] expected) {
        sorter.quickSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    void testSimpleArray() {
        int[] input = {23, 98, 12, 67, 45, 89, 34, 76, 56, 10};
        int[] expected = {10, 12, 23, 34, 45, 56, 67, 76, 89, 98};
        sortAndAssert(input, expected);
    }

    @Test
    void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        sortAndAssert(input, expected);
    }

    @Test
    void testSingleElementArray() {
        int[] input = {42};
        int[] expected = {42};
        sortAndAssert(input, expected);
    }

    @Test
    void testAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        sortAndAssert(input, expected);
    }

    @Test
    void testReverseSortedArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        sortAndAssert(input, expected);
    }

    @Test
    void testArrayWithDuplicates() {
        int[] input = {3, 1, 2, 3, 3, 4, 1};
        int[] expected = {1, 1, 2, 3, 3, 3, 4};
        sortAndAssert(input, expected);
    }

    @Test
    void testLargeArray() {
        int[] input = {934, 482, 120, 985, 347, 658, 218, 749, 830, 121, 992};
        int[] expected = {120, 121, 218, 347, 482, 658, 749, 830, 934, 985, 992};
        sortAndAssert(input, expected);
    }
}
