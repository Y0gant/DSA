package programs.arrays.medium;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 0, 0};
        nextPermutation(arr);
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        //find breakpoint index
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        //if breakpoint doesn't exist
        if (index == -1) {
            for (int i = 0; i < n / 2; i++) {
                int temp = nums[i];
                nums[i] = nums[n - i - 1];
                nums[n - i - 1] = temp;
            }
            return;
        }
        //find next greater than nums[index] between index and n-1
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        reverse(nums, index + 1, n);

    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}