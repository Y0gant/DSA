package programs.arrays.easy;

import java.util.HashMap;

public class SingleNumberInArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 2, 3, 1};
        int[] arr2 = {5, 6, 7, 5, 8, 7, 6};
        int[] arr3 = {9, 10, 11, 9, 12, 11, 10};
        int[] arr4 = {13, 14, 15, 13, 14, 16, 15};
        System.out.println(singleNumberBrute(arr1));
        System.out.println(singleNumberBetter(arr2));
        System.out.println(singleNumberOptimal(arr3));
        System.out.println(singleNumberOptimal(arr4));
    }

    public static int singleNumberOptimal(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }


    //T.C->O(N)+O(M)-(M=size of map/2-numbers appears twice )
    //S.C->O(M)
    public static int singleNumberBetter(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) return nums[i];
        }
        return 0;
    }

    //T.C->O(N^2)
    //S.C->O(1)
    public static int singleNumberBrute(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) count++;
            }
            if (count == 1) {
                return num;
            }
        }
        return 0;
    }
}
