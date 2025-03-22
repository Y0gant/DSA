package programs.arrays.easy;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        int[] nums = {-3, -1, 0, 0, 0, 3, 3};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicates(nums2);
        int k2 = removeDuplicates2(nums);
        for (int i = 0; i < k2; i++) {
            System.out.print(nums[i] + " , ");
        }
        System.out.println();
        for (int i = 0; i < k; i++) {
            System.out.print(nums2[i] + " , ");
        }
    }

    //Bruteforce
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> uniqueElements = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            uniqueElements.add(nums[i]);
        }
        int j = 0;
        int k = uniqueElements.size();
        for (int x : uniqueElements) {
            nums[j++] = x;
        }
        return k;
    }

    public static int removeDuplicates2(int[] nums) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[p]) {
                p++;
                nums[p] = nums[i];
            }
        }
        return ++p;
    }

}
