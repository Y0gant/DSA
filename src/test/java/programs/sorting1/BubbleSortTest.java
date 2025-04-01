package programs.sorting1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    void testBubbleSortWithSmallArray() {
        int[] input = {23, 98, 12, 67, 45, 89, 34, 76, 56, 10};
        int[] expected = {10, 12, 23, 34, 45, 56, 67, 76, 89, 98};
        assertArrayEquals(expected, bubbleSort.bubbleSort(input.clone()));
    }

    @Test
    void testBubbleSortWithMediumArray() {
        int[] input = {345, 678, 123, 876, 432, 567, 234, 789, 987, 345};
        int[] expected = {123, 234, 345, 345, 432, 567, 678, 789, 876, 987};
        assertArrayEquals(expected, bubbleSort.bubbleSort(input.clone()));
    }

    @Test
    void testBubbleSortWithLargeArray() {
        int[] input = {934, 482, 120, 985, 347, 658, 218, 749, 830, 121};
        int[] expected = {120, 121, 218, 347, 482, 658, 749, 830, 934, 985};
        assertArrayEquals(expected, bubbleSort.bubbleSort(input.clone()));
    }

    @Test
    void testBubbleSortWithAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(expected, bubbleSort.bubbleSort(input.clone()));
    }

    @Test
    void testBubbleSortWithReverseSortedArray() {
        int[] input = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(expected, bubbleSort.bubbleSort(input.clone()));
    }

    @Test
    void testBubbleSortWithAllSameElements() {
        int[] input = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        int[] expected = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        assertArrayEquals(expected, bubbleSort.bubbleSort(input.clone()));
    }

    @Test
    void testBubbleSortWithSingleElementArray() {
        int[] input = {42};
        int[] expected = {42};
        assertArrayEquals(expected, bubbleSort.bubbleSort(input.clone()));
    }

    @Test
    void testBubbleSortWithEmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, bubbleSort.bubbleSort(input.clone()));
    }
}
