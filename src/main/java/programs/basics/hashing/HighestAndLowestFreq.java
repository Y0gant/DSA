package programs.basics.hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestAndLowestFreq {

    public static void main(String args[]) {

        int[] arr = {38, 37, 17, 32, 9, 24, 36, 27, 16, 9, 12, 19, 8, 30, 33, 27, 28, 32, 40, 40, 27, 12, 11, 7, 22, 35, 12, 16, 34, 30, 4, 32, 14, 26, 33, 21, 28, 40, 36, 25, 24, 2, 1, 13, 10, 7, 19, 11, 25, 19, 14, 32, 6, 4, 1, 13, 20, 26, 24, 21, 24, 9, 2, 4, 27, 3, 19, 12, 16, 21, 20, 26, 35, 29, 16, 33, 30, 36, 33, 39, 19, 23, 11, 37, 24, 20, 18, 24, 5, 18, 36, 9, 6, 2, 35, 6, 28, 28, 34, 30, 15, 23, 40, 34, 29, 9, 30, 26, 39, 1, 11, 17, 19, 11, 4, 40, 32, 40, 24, 23, 36, 25, 21, 24, 32, 4, 18, 28, 6, 4, 7, 26, 36, 21, 8, 3, 2, 20, 32, 36, 15, 23, 10, 32, 32, 15, 31, 14, 23, 9, 6, 33, 34, 11, 37, 23, 6, 34, 36, 35, 13, 15, 11, 39, 10, 36, 20, 2, 40, 4, 20, 38, 40, 17, 12, 16, 40, 9, 27, 25, 9, 5, 32, 22, 18, 25, 10, 21, 12, 32, 7, 38, 40, 31, 40, 19, 4, 10, 19, 8, 40, 29, 17, 33, 25, 19, 8, 11, 29, 30};
        
        int n = arr.length;
        Frequency(arr, n);
    }

    static void Frequency(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int maxFrequency = 0, minFrequency = n;
        int maxElement = 0, minElement = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFrequency) {
                maxElement = element;
                maxFrequency = count;
            }
            if (count < minFrequency) {
                minElement = element;
                minFrequency = count;
            }
        }

        System.out.println("The highest frequency element is: " + maxElement);
        System.out.println("The lowest frequency element is: " + minElement);
    }
} 