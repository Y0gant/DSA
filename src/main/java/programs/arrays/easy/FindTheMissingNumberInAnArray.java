package programs.arrays.easy;

public class FindTheMissingNumberInAnArray {

    public static int findMissingOptimal1(int[] nums) {
        //T.C-> O(N)
        //S.C->O(1)
        int n = nums.length;
        int sum1 = n * (n - 1) / 2;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum2 += nums[i];
        }
        return sum1 - sum2;
    }

    public static int findMissingBetter(int[] nums) {
        //T.C-> O(2*N)
        //S.C->O(N)
        int[] hash = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 0) return i;
        }
        return -1;
    }

    public static int findMissingBrute(int[] nums) {
        //T.C-> O(N^2)
        //S.C->O(1)
        for (int i = 0; i <= nums.length; i++) {
            int flag = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) return i;
        }
        return -1;
    }
}
