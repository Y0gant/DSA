package programs.arrays.easy;

import java.util.HashMap;

public class LongestSubArraySumPos {
    public static void main(String[] args) {
        int[] arrBrute = {1, 2, 3, 1, 1, 1, 1};
        int k1 = 3;

        int[] arrBetter = {4, 1, 1, 1, 2, 3, 5};
        int k2 = 5;

        int[] arrOptimal = {10, 5, 2, 7, 1, 9};
        int k3 = 15;
        System.out.println(longestSubArrayBrute(arrBrute, k1));
        System.out.println(longestSubArrayBetter(arrBetter, k2));
        System.out.println(longestSubArrayOptimal(arrOptimal, k3));

    }

    public static int longestSubArrayOptimal(int[] arr, int k) {
        int n = arr.length;
        int left = 0, right = 0;
        int maxLength = 0;
        int sum = arr[0];
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
            if (right < n) sum += arr[right];
        }
        return maxLength;
    }


    public static int longestSubArrayBetter(int[] arr, long k) {
        HashMap<Long, Integer> map = new HashMap<>();
        int length = 0;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                length = Math.max(length, i + 1);
            }
            long rem = sum - k;
            if (map.containsKey(rem)) {
                int subLen = i - map.get(rem);
                length = Math.max(length, subLen);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return length;
    }

    public static int longestSubArrayBrute(int[] arr, int k) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    length = Math.max(length, j - i + 1);
                }
            }
        }
        return length;
    }
}
