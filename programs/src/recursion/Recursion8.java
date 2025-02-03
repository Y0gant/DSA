package src.recursion;

public class Recursion8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int s = 0;
        int e = arr.length - 1;
        int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int e2 = arr2.length - 1;

        Recursion8 obj1 = new Recursion8();
        obj1.reverseArray(arr, e);

        obj1.reverseArray(arr2, s, e2);

    }


    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");

        }
        System.out.println();
    }


    public void reverseArray(int[] arr, int s, int e) {
        if (s >= e) {
            System.out.println("Using recursive method :");
            printArray(arr);
            return;
        }
        arr[s] = arr[s] + arr[e];
        arr[e] = arr[s] - arr[e];
        arr[s] = arr[s] - arr[e];
        reverseArray(arr, s + 1, e - 1);
    }

    public void reverseArray(int[] arr, int e) {
        int s = 0;
        while (s < e) {
            arr[s] = arr[s] ^ arr[e];
            arr[e] = arr[s] ^ arr[e];
            arr[s] = arr[s] ^ arr[e];
            s++;
            e--;
        }
        printArray(arr);
    }
}
