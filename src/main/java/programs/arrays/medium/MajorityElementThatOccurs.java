package programs.arrays.medium;

import java.util.HashMap;

public class MajorityElementThatOccurs {

    public static int findMajorityOptimal(int[] arr) {


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
