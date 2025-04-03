package programs.arrays.medium;

import java.util.HashMap;

public class MajorityElementThatOccurs {
    public static void main(String[] args) {
        int[] arrOptimal = {2, 2, 1, 1, 1, 2, 2};
        int[] arrBetter = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int[] arrBrute = {1, 1, 2, 1, 3, 1, 1};

        System.out.println("Majority Element (Optimal): " + findMajorityOptimal(arrOptimal));
        System.out.println("Majority Element (Better): " + findMajorityBetter(arrBetter));
        System.out.println("Majority Element (Brute Force): " + findMajorityBrute(arrBrute));
    }

    public static int findMajorityOptimal(int[] arr) {
        int n = arr.length;
        int major = n / 2;
        int count = 0;
        int element = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                element = arr[i];
            } else if (arr[i] == element) {
                count++;
            } else count--;
        }

        int count2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == element) count2++;
        }

        if (count2 > major) {
            return element;
        }

        return -1;
    }

    public static int findMajorityBetter(int[] arr) {
        int n = arr.length;
        int majority = n / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) > majority) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int findMajorityBrute(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > arr.length / 2) {
                return arr[i];
            }
        }
        return -1;
    }
}
