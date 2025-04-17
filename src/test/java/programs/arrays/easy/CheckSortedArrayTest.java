package programs.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckSortedArrayTest {

    @Test
    public void testSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        assertTrue(CheckSortedArray.checkIfSorted(arr));
    }

    @Test
    public void testUnsortedArray() {
        int[] arr = {5, 3, 1, 4, 2};
        assertFalse(CheckSortedArray.checkIfSorted(arr));
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {42};
        assertTrue(CheckSortedArray.checkIfSorted(arr));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertTrue(CheckSortedArray.checkIfSorted(arr));
    }

    @Test
    public void testAllEqualElements() {
        int[] arr = {7, 7, 7, 7};
        assertTrue(CheckSortedArray.checkIfSorted(arr));
    }

    @Test
    public void testDescendingOrderArray() {
        int[] arr = {9, 7, 5, 3, 1};
        assertFalse(CheckSortedArray.checkIfSorted(arr));
    }

    @Test
    public void testLargeUnsortedArray() {
        int[] arr = {876, 543, 210, 678, 432, 109, 987, 654, 321, 765,
                432, 876, 543, 219, 348, 576, 694, 817, 928, 135,
                246, 357, 468, 579, 681, 792, 903, 114, 225, 336,
                447, 558, 669, 770, 881, 992, 103, 214, 325, 436,
                547, 658, 769, 870, 981, 192, 303, 414, 525, 636};
        assertFalse(CheckSortedArray.checkIfSorted(arr));
    }

    @Test
    public void testSortedAfterSorting() {
        int[] arr = {876, 543, 210, 678};
        java.util.Arrays.sort(arr);
        assertTrue(CheckSortedArray.checkIfSorted(arr));
    }
}
