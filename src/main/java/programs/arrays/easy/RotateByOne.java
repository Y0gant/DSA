package programs.arrays.easy;

public class RotateByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        rotateByOne(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void rotateByOne(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }
}
