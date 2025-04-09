package programs.arrays.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int[] numsOptimal = {100, 4, 200, 1, 3, 2};
        int resultOptimal = longestConsecutiveOptimal(numsOptimal);
        System.out.println("Longest Consecutive Sequence (Optimal): " + resultOptimal);

        int[] numsBetter = {9, 1, 4, 7, 3, 2, 6, 5};
        int resultBetter = longestConsecutiveBetter(numsBetter);
        System.out.println("Longest Consecutive Sequence (Better): " + resultBetter);


        int[] numsBrute = {10, 5, 12, 3, 55, 30, 4, 11, 2};
        int resultBrute = longestConsecutiveBrute(numsBrute);
        System.out.println("Longest Consecutive Sequence (Brute): " + resultBrute);
    }

    public static int longestConsecutiveOptimal(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int longest = 0;
        for (int it : set) {
            if (!set.contains(it - 1)) {
                int count = 1;
                int current = it;
                while (set.contains(current + 1)) {
                    count++;
                    current++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }


    public static int longestConsecutiveBetter(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int maxCount = 1;
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            } else if (nums[i] + 1 == nums[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }


    public static boolean linearSearch(int[] a, int num) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == num)
                return true;
        }
        return false;
    }

    public static int longestConsecutiveBrute(int[] nums) {
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int count = 1;
            while (linearSearch(nums, x + 1)) {
                count++;
                x++;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }

}
