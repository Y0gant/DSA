package programs.sorting2;

public class RecursiveBubbleSort {

    public static void main(String[] args) {
        int[] arr = {23, 98, 12, 67, 45, 89, 34, 76, 56, 10};
        int[] arr2 = {345, 678, 123, 876, 432, 567, 234, 789, 987, 345, 654, 111, 222, 333, 444, 555, 777, 888, 999, 101, 202, 303, 404, 505, 606, 707, 808, 909, 112, 223, 334, 445, 556, 667, 778, 889, 990, 121, 232, 343, 454, 565, 676, 787, 898, 909, 212, 323, 434, 545};
        int[] arr3 = {934, 482, 120, 985, 347, 658, 218, 749, 830, 121, 992, 563, 710, 425, 388, 640, 923, 571, 268, 348, 879, 109, 230, 456, 901, 345, 876, 654, 322, 490, 582, 764, 381, 502, 671, 248, 390, 805, 911, 134, 294, 856, 467, 649, 100, 999, 739, 689, 413, 583, 781, 203, 487, 915, 627, 556, 792, 201, 348, 710, 476, 359, 623, 402, 822, 954, 660, 531, 912, 875, 243, 501, 390, 256, 807, 143, 908, 687, 511, 779, 646, 888, 932, 572, 492, 819, 110, 620, 415, 267, 305, 723, 490, 340, 651, 799, 730, 448, 558, 612};
        RecursiveBubbleSort rec = new RecursiveBubbleSort();
        rec.recursiveBS(arr, arr.length);
        rec.recursiveBS(arr2, arr2.length);
        rec.recursiveBS(arr3, arr3.length);
        MergeSort.printArray(arr);
        MergeSort.printArray(arr2);
        MergeSort.printArray(arr3);
    }

    public void recursiveBS(int[] arr, int n) {
        if (n == 0) {
            return;
        }
        if (n == 1) {
            return;
        }
        for (int i = 0; i <= n - 2; i++) {
            int adj = i + 1;

            if (arr[i] > arr[adj]) {
                int temp = arr[adj];
                arr[adj] = arr[i];
                arr[i] = temp;
            }
        }
        recursiveBS(arr, n - 1);

    }
}
