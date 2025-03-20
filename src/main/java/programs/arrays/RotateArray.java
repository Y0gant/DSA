package programs.arrays;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray obj = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        obj.rotateRightBrute(nums2, 3);
        obj.rotateLeftBrute(nums, 3);
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : nums2) {
            System.out.print(i + " ");
        }

    }

    public void rotateLeftBrute(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];

        }

        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }

        for (int i = n - k; i < n; i++) {
            nums[i] = temp[i - (n - k)];
        }

    }

    public void rotateRightBrute(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];

        for (int i = n - 1; i >= n - k; i--) {
            temp[(n - 1) - i] = nums[i];
        }

        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = k - 1; i >= 0; i--) {
            nums[(k - 1) - i] = temp[i];
        }
    }
}
