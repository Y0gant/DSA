package programs.sorting2;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr = {23, 98, 12, 67, 45, 89, 34, 76, 56, 10};
        int[] arr2 = {345, 678, 123, 876, 432, 567, 234, 789, 987, 345,
                654, 111, 222, 333, 444, 555, 777, 888, 999, 101,
                202, 303, 404, 505, 606, 707, 808, 909, 112, 223,
                334, 445, 556, 667, 778, 889, 990, 121, 232, 343,
                454, 565, 676, 787, 898, 909, 212, 323, 434, 545};
        int[] arr3 = {934, 482, 120, 985, 347, 658, 218, 749, 830, 121,
                992, 563, 710, 425, 388, 640, 923, 571, 268, 348,
                879, 109, 230, 456, 901, 345, 876, 654, 322, 490,
                582, 764, 381, 502, 671, 248, 390, 805, 911, 134,
                294, 856, 467, 649, 100, 999, 739, 689, 413, 583,
                781, 203, 487, 915, 627, 556, 792, 201, 348, 710,
                476, 359, 623, 402, 822, 954, 660, 531, 912, 875,
                243, 501, 390, 256, 807, 143, 908, 687, 511, 779,
                646, 888, 932, 572, 492, 819, 110, 620, 415, 267,
                305, 723, 490, 340, 651, 799, 730, 448, 558, 612};
        RecursiveInsertionSort sort = new RecursiveInsertionSort();
        sort.recursiveInsertionSort(arr, 1, arr.length);
        MergeSort.printArray(arr);
        sort.recursiveInsertionSort(arr2, 1, arr2.length);
        MergeSort.printArray(arr2);
        sort.recursiveInsertionSort(arr3, 1, arr3.length);
        MergeSort.printArray(arr3);
    }

    public void recursiveInsertionSort(int[] arr, int i, int n) {
        if (n == 0) return;
        if (i == n) {
            return;
        }

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {

            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;

        }
        recursiveInsertionSort(arr, i + 1, n);
    }
}
