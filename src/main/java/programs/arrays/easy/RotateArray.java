package programs.arrays.easy;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray obj = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        obj.rotateRightBrute(nums2, 3);
//        obj.rotateLeftBrute(nums, 3);
        obj.rotateLeft(nums, 3);
        obj.rotateRight(nums2, 4);
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : nums2) {
            System.out.print(i + " ");
        }

    }

    //optimal approach for rotating an array
    public void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotateLeft(int[] arr, int k) {
        if (arr == null || arr.length <= 1) return;
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public void rotateRight(int[] arr, int k) {
        if (arr == null || arr.length <= 1) return;
        int n = arr.length;
        k = k % n;
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, 0, n - 1);

    }

    //Bruteforce approaches
    public void rotateLeftBrute(int[] nums, int k) {
        if (nums == null || nums.length <= 1) return;
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];

        System.arraycopy(nums, 0, temp, 0, k);

        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }

        if (n - (n - k) >= 0) System.arraycopy(temp, n - k - (n - k), nums, n - k, n - (n - k));

    }

    public void rotateRightBrute(int[] nums, int k) {
        if (nums == null || nums.length <= 1) return;
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
