package programs.sorting2;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {23, 98, 12, 67, 45, 89, 34, 76, 56, 10};
        int[] arr2 = {345, 678, 123, 876, 432, 567, 234, 789, 987, 345, 654, 111, 222, 333, 444, 555, 777, 888, 999,
                101, 202, 303, 404, 505, 606, 707, 808, 909, 112, 223, 334, 445, 556, 667, 778, 889, 990, 121, 232,
                343, 454, 565, 676, 787, 898, 909, 212, 323, 434, 545};
        int[] arr3 = {934, 482, 120, 985, 347, 658, 218, 749, 830, 121, 992, 563, 710, 425, 388, 640, 923, 571, 268,
                348, 879, 109, 230, 456, 901, 345, 876, 654, 322, 490, 582, 764, 381, 502, 671, 248, 390, 805, 911,
                134, 294, 856, 467, 649, 100, 999, 739, 689, 413, 583, 781, 203, 487, 915, 627, 556, 792, 201, 348,
                710, 476, 359, 623, 402, 822, 954, 660, 531, 912, 875, 243, 501, 390, 256, 807, 143, 908, 687, 511,
                779, 646, 888, 932, 572, 492, 819, 110, 620, 415, 267, 305, 723, 490, 340, 651, 799, 730, 448, 558, 612};

        QuickSort obj = new QuickSort();
        obj.quickSort(arr, 0, arr.length - 1);
        obj.quickSort(arr2, 0, arr2.length - 1);
        obj.quickSort(arr3, 0, arr3.length - 1);
        printArray(arr);
        printArray(arr2);
        printArray(arr3);
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = placePivot(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    int placePivot(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] <= pivot) i++;
            while (j > low && arr[j] > pivot) j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

}
