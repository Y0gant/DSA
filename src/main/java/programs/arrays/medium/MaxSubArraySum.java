package programs.arrays.medium;

public class MaxSubArraySum {

    public static void main(String[] args) {
        MaxSubArraySum obj = new MaxSubArraySum();

        int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Sum (with print): " + obj.maxSubArrayPrint(arr1));

        int[] arr2 = {5, -3, 2, 7, -10, 6, 4};
        System.out.println("Max Sum (Kadane's): " + obj.maxSubArray(arr2));

        int[] arr3 = {-1, -2, -3, -4};
        System.out.println("Max Sum (Brute-force): " + obj.maxSubArrayBrute(arr3));
    }


    public int maxSubArrayPrint(int[] nums) {
        int maxEl = Integer.MIN_VALUE;
        int sum = 0, ansStart = 0, ansEnd = 0, start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += nums[i];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > maxEl) {
                maxEl = sum;
                ansStart = start;
                ansEnd = i;

            }
        }

        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return maxEl;

    }

    //Kadane's algorithm
    //T.C = O(n)
    //S.C = O(1)
    public int maxSubArray(int[] nums) {
        int maxEl = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxEl) {
                maxEl = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxEl;
    }

    //T.C -> O(n^2)
    //S.C -> O(1)
    public int maxSubArrayBrute(int[] nums) {
        int maxEl = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxEl = Math.max(maxEl, sum);
            }
        }
        return maxEl;
    }
}
