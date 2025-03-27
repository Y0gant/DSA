package programs.arrays.easy;

public class FindTheMissingNumberInAnArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 0};
        int[] arr2 = {3, 0, 2, 4, 5};
        int[] arr3 = {1, 3, 4, 0};
        int[] arr4 = {2, 3, 1, 0};

        System.out.println(findMissingBrute(arr1));
        System.out.println(findMissingBetter(arr2));
        System.out.println(findMissingOptimal1(arr3));
        System.out.println(findMissingOptimal2(arr4));

    }

    public static int findMissingOptimal2(int[] nums) {
//better than the optimal 1 because if n = 10^5, n+1 = (10^5 +1) this will overflow the integer data type,
// and we are required to use a bigger data type like a long.
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 = sum1 ^ (i + 1);
            sum2 = sum2 ^ nums[i];
        }
        return sum1 ^ sum2;
    }

    public static int findMissingOptimal1(int[] nums) {
        //T.C-> O(N)
        //S.C->O(1)
        int n = nums.length;
        int sum1 = n * (n + 1) / 2;
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
        //Numbers ranging from 1 to N
        for (int i = 1; i < hash.length; i++) {
            if (hash[i] == 0) return i;
        }
        return -1;
    }

    public static int findMissingBrute(int[] nums) {
        //T.C-> O(N^2)
        //S.C->O(1)
        //Range 1 to N
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
