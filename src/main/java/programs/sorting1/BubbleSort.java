package programs.sorting1;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        BubbleSort obj = new BubbleSort();
        int[] sorted = obj.bubbleSort(arr);
        printArray(sorted);


    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // can also use reverse for loop
            //for (int i = n-1; i >= 1 ; i--)
            int didSwap = 0;
            for (int j = 0; j < n - i - 1; j++) {
                //for (int j = 0; j < i ; j++)
                int adj = j + 1;
                if (arr[j] > arr[adj]) {
                    int temp = arr[j];
                    arr[j] = arr[adj];
                    arr[adj] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
        }

        return arr;
    }
}
