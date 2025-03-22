package programs.arrays.easy;

import java.util.Arrays;

public class LargestElementInAnArray {

    public static void main(String[] args) {
        int[] arr = {345, 678, 123, 876, 432, 567, 234, 789, 987, 345,
                654, 111, 222, 333, 444, 555, 777, 888, 999, 101,
                202, 303, 404, 505, 606, 707, 808, 909, 112, 223,
                334, 445, 556, 667, 778, 889, 990, 121, 232, 343,
                454, 565, 676, 787, 898, 909, 212, 323, 434, 545};

        int[] arr2 = {876, 543, 210, 678, 432, 109, 987, 654, 321, 765,
                432, 876, 543, 219, 348, 576, 694, 817, 928, 135,
                246, 357, 468, 579, 681, 792, 903, 114, 225, 336,
                447, 558, 669, 770, 881, 992, 103, 214, 325, 436,
                547, 658, 769, 870, 981, 192, 303, 414, 525, 636};


        System.out.println("Largest element of 1st array : " + largestElement(arr));
        System.out.println("Largest element of 1st array : " + largestElement2(arr2));

    }

    public static int largestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int largestElement2(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
