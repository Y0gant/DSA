package programs.arrays;

import java.util.ArrayList;

public class MoveZeroesToLast {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 1, 2, 5, 7, 3, 8, 0, 0, 0, 0, 1, 2, 4, 6, 8, 4, 8, 3, 9};
        int[] arr2 = {0, 1, 0, 0, 0, 4, 6, 0, 7, 5, 1, 2};
        moveZeroes(arr);
        moveZeroesBrute(arr2);
        print(arr);
        print(arr2);
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void moveZeroes(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                arr[i] = 0;
                j++;
            }
        }

    }


    public static void moveZeroesBrute(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                list.add(arr[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        for (int i = list.size(); i < arr.length; i++) {
            arr[i] = 0;
        }

    }
}
