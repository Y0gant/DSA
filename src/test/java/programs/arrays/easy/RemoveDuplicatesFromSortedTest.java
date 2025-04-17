package programs.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedTest {

    @Test
    public void testBruteForceRemoveDuplicates_AllUnique() {
        int[] nums = {1, 2, 3, 4};
        int k = RemoveDuplicatesFromSorted.removeDuplicates(nums);
        assertEquals(4, k);
        assertArrayEquals(new int[]{1, 2, 3, 4}, extract(nums, k));
    }

    @Test
    public void testBruteForceRemoveDuplicates_WithDuplicates() {
        int[] nums = {1, 1, 2, 2, 3, 3};
        int k = RemoveDuplicatesFromSorted.removeDuplicates(nums);
        assertEquals(3, k);
        assertArrayEquals(new int[]{1, 2, 3}, extract(nums, k));
    }

    @Test
    public void testBruteForceRemoveDuplicates_EmptyArray() {
        int[] nums = {};
        int k = RemoveDuplicatesFromSorted.removeDuplicates(nums);
        assertEquals(0, k);
    }

    @Test
    public void testOptimizedRemoveDuplicates2() {
        int[] nums = {0, 0, 1, 1, 2, 3, 3};
        int k = RemoveDuplicatesFromSorted.removeDuplicates2(nums);
        assertEquals(4, k);
        assertArrayEquals(new int[]{0, 1, 2, 3}, extract(nums, k));
    }

    @Test
    public void testOptimizedRemoveDuplicates2_SingleElement() {
        int[] nums = {7};
        int k = RemoveDuplicatesFromSorted.removeDuplicates2(nums);
        assertEquals(1, k);
        assertArrayEquals(new int[]{7}, extract(nums, k));
    }

    @Test
    public void testOptimizedRemoveDuplicates2_AllDuplicates() {
        int[] nums = {2, 2, 2, 2, 2};
        int k = RemoveDuplicatesFromSorted.removeDuplicates2(nums);
        assertEquals(1, k);
        assertArrayEquals(new int[]{2}, extract(nums, k));
    }

    @Test
    public void testOptimizedRemoveDuplicates2_EmptyArray() {
        int[] nums = {};
        int k = RemoveDuplicatesFromSorted.removeDuplicates2(nums);
        assertEquals(1, k);
    }

    private int[] extract(int[] nums, int k) {
        int[] trimmed = new int[k];
        System.arraycopy(nums, 0, trimmed, 0, k);
        return trimmed;
    }
}
