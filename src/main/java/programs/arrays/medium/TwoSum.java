package programs.arrays.medium;

/*Given an array of integers nums and an integer target,
 return indices of the two numbers such that they add up to target.
 You may assume that each input would have exactly one solution,
 and you may not use the same element twice.
 You can return the answer in any order.*/

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 1, 7, 9};
        int target1 = 8;
        System.out.println("twoSum result: " + twoSum(arr1, target1));


        int[] arr2 = {2, 7, 11, 15};
        int target2 = 9;
        int[] result2 = getTwoSumsBetter(arr2, target2);
        System.out.println("getTwoSumsBetter result: " + Arrays.toString(result2));


        int[] arr3 = {3, 2, 4};
        int target3 = 6;
        int[] result3 = getTwoSumsBrute(arr3, target3);
        System.out.println("getTwoSumsBrute result: " + Arrays.toString(result3));
    }

    public static String twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        Arrays.sort(nums);
   
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) left++;
            else right--;
        }
        return "NO";
    }

    public static int[] getTwoSumsBetter(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] indices = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int rem = k - arr[i];
            if (map.containsKey(rem)) {
                indices[0] = i;
                indices[1] = map.get(rem);
            }
            map.put(arr[i], i);
        }
        return indices;
    }

    public static int[] getTwoSumsBrute(int[] arr, int k) {
        int[] indices = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) continue;
                if (arr[i] + arr[j] == k) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }

}
