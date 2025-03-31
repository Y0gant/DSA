package programs.arrays.medium;

/*Given an array consisting of only 0s, 1s, and 2s.
 Write a program to in-place sort the array without using inbuilt sort functions.
 ( Expected: Single pass-O(N) and constant space)*/

public class SortZeroesOnesTwos {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0, 0, 1, 1, 2, 2, 1, 0, 0, 0, 1, 1, 2, 2, 2, 0};
        // sortColorsBetter(arr);
        sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                mid++;
                low++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else mid++;
        }

    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    //T.C = O(2N)
    //S.C = O(1)
    public static void sortColorsBetter(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (j < count0) {
                nums[j] = 0;
            } else if (j < count0 + count1) {
                nums[j] = 1;
            } else {
                nums[j] = 2;
            }
        }

    }
//              Brute force approach
//        public static void sortColorsBrute(int[] nums){
//                  Arrays.sort(nums);
//        }
}
