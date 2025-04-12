package programs.arrays.medium;

import java.util.HashMap;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        SubArraySumEqualsK obj = new SubArraySumEqualsK();


        int[] optimizedTest = {1, 2, 3, -1, 1, 2};
        System.out.println("Optimized Method Output: " + obj.subArraySum(optimizedTest, 3));

       
        int[] bruteTest = {1, 1, 1, 2, -1};
        System.out.println("Brute-Force Method Output: " + obj.subArrayBrute(bruteTest, 2));
    }


    public int subArraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> prefix = new HashMap<>();
        prefix.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum - k;

            count += prefix.getOrDefault(rem, 0);

            prefix.put(sum, prefix.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public int subArrayBrute(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
