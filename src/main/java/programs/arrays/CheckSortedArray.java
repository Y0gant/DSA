package programs.arrays;

import java.util.Arrays;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr2 = {876, 543, 210, 678, 432, 109, 987, 654, 321, 765,
                432, 876, 543, 219, 348, 576, 694, 817, 928, 135,
                246, 357, 468, 579, 681, 792, 903, 114, 225, 336,
                447, 558, 669, 770, 881, 992, 103, 214, 325, 436,
                547, 658, 769, 870, 981, 192, 303, 414, 525, 636};
        System.out.println(checkIfSorted(arr2));
        Arrays.sort(arr2);
        System.out.println(checkIfSorted(arr2));

    }

    public static boolean checkIfSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
