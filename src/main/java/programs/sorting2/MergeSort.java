package programs.sorting2;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort merger = new MergeSort();

        int[] arr = {23, 98, 12, 67, 45, 89, 34, 76, 56, 10};
        int[] arr2 = {345, 678, 123, 876, 432, 567, 234, 789, 987, 345, 654, 111, 222, 333, 444, 555, 777, 888, 999,
                101, 202, 303, 404, 505, 606, 707, 808, 909, 112, 223, 334, 445, 556, 667, 778, 889, 990, 121, 232,
                343, 454, 565, 676, 787, 898, 909, 212, 323, 434, 545};
        int[] arr3 = {934, 482, 120, 985, 347, 658, 218, 749, 830, 121, 992, 563, 710, 425, 388, 640, 923, 571, 268,
                348, 879, 109, 230, 456, 901, 345, 876, 654, 322, 490, 582, 764, 381, 502, 671, 248, 390, 805, 911,
                134, 294, 856, 467, 649, 100, 999, 739, 689, 413, 583, 781, 203, 487, 915, 627, 556, 792, 201, 348,
                710, 476, 359, 623, 402, 822, 954, 660, 531, 912, 875, 243, 501, 390, 256, 807, 143, 908, 687, 511,
                779, 646, 888, 932, 572, 492, 819, 110, 620, 415, 267, 305, 723, 490, 340, 651, 799, 730, 448, 558, 612};

        int[] sorted = merger.mergeSort(arr, 0, arr.length - 1);
        int[] sorted2 = merger.mergeSort(arr2, 0, arr2.length - 1);
        int[] sorted3 = merger.mergeSort(arr3, 0, arr3.length - 1);

        printArray(sorted);
        printArray(sorted2);
        printArray(sorted3);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

    public int[] merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return arr;
    }

    public int[] mergeSort(int[] arr, int low, int high) {

        if (arr.length == 0) {
            return arr;
        }

        int mid = (low + high) / 2;

        if (low >= high) {
            return merge(arr, low, mid, high);
        }

        mergeSort(arr, low, mid);

        mergeSort(arr, mid + 1, high);

        return merge(arr, low, mid, high);
    }

}
