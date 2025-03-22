package programs.arrays.easy;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] arr1 = {345, 678, 123, 876, 432, 567, 234, 789, 987, 345,
                654, 111, 222, 333, 444, 555, 777, 888, 999, 101,
                202, 303, 404, 505, 606, 707, 808, 909, 112, 223,
                334, 445, 556, 667, 778, 889, 990, 121, 232, 343,
                454, 565, 676, 787, 898, 919, 212, 323, 434, 545};

        System.out.println("Second largest element: " + secondLargest(arr1));
        System.out.println("Second smallest element: " + secondSmallest(arr1));

    }

    public static int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] != largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int secondSmallest(int[] arr) {
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                sSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < sSmallest) {
                sSmallest = arr[i];
            }
        }
        return sSmallest;
    }
}