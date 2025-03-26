package programs.sorting1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {

    SelectionSort obj = new SelectionSort();

    @Test
    public void testSortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, obj.selectionSort(input));
    }

    @Test
    public void testReverseSortedArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, obj.selectionSort(input));
    }

    @Test
    public void testUnsortedArray() {
        int[] input = {23, 98, 12, 67, 45, 89, 34, 76, 56, 10};
        int[] expected = {10, 12, 23, 34, 45, 56, 67, 76, 89, 98};
        assertArrayEquals(expected, obj.selectionSort(input));
    }

    @Test
    public void testArrayWithDuplicates() {
        int[] input = {5, 3, 8, 3, 2, 8, 1};
        int[] expected = {1, 2, 3, 3, 5, 8, 8};
        assertArrayEquals(expected, obj.selectionSort(input));
    }

    @Test
    public void testSingleElementArray() {
        int[] input = {42};
        int[] expected = {42};
        assertArrayEquals(expected, obj.selectionSort(input));
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, obj.selectionSort(input));
    }

    @Test
    public void testLargeArray() {
        int[] input = {345, 678, 123, 876, 432, 567, 234, 789, 987, 345};
        int[] expected = {123, 234, 345, 345, 432, 567, 678, 789, 876, 987};
        assertArrayEquals(expected, obj.selectionSort(input));
    }
}
