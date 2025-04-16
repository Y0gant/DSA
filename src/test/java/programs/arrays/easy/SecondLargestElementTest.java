package programs.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondLargestElementTest {

    @Test
    void testSecondLargestWithTypicalArray() {
        int[] arr = {345, 678, 123, 876, 432, 567, 234, 789, 987};
        assertEquals(876, SecondLargestElement.secondLargest(arr));
    }

    @Test
    void testSecondSmallestWithTypicalArray() {
        int[] arr = {345, 678, 123, 876, 432, 567, 234, 789, 987};
        assertEquals(234, SecondLargestElement.secondSmallest(arr));
    }

    @Test
    void testSecondLargestWithDuplicates() {
        int[] arr = {100, 200, 200, 300, 300};
        assertEquals(200, SecondLargestElement.secondLargest(arr));
    }

    @Test
    void testSecondSmallestWithDuplicates() {
        int[] arr = {100, 100, 200, 200, 300};
        assertEquals(200, SecondLargestElement.secondSmallest(arr));
    }

    @Test
    void testSecondLargestWithAllSameValues() {
        int[] arr = {500, 500, 500};
        assertEquals(-1, SecondLargestElement.secondLargest(arr)); // Based on current logic
    }

    @Test
    void testSecondSmallestWithAllSameValues() {
        int[] arr = {500, 500, 500};
        assertEquals(Integer.MAX_VALUE - 1, SecondLargestElement.secondSmallest(arr)); // As per current logic
    }

    @Test
    void testSecondLargestWithTwoElements() {
        int[] arr = {10, 20};
        assertEquals(10, SecondLargestElement.secondLargest(arr));
    }

    @Test
    void testSecondSmallestWithTwoElements() {
        int[] arr = {10, 20};
        assertEquals(20, SecondLargestElement.secondSmallest(arr));
    }

    @Test
    void testSecondLargestWithNegativeValues() {
        int[] arr = {-10, -20, -30, -5, -15};
        assertEquals(-10, SecondLargestElement.secondLargest(arr));
    }

    @Test
    void testSecondSmallestWithNegativeValues() {
        int[] arr = {-10, -20, -30, -5, -15};
        assertEquals(-20, SecondLargestElement.secondSmallest(arr));
    }
}
