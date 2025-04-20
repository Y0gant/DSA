package programs.arrays.hard;

//* Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2 {
    public static void main(String[] args) {

        int[] arrBrute = {1, 2, 3, 1, 1, 2, 2, 2};
        System.out.println("Brute Force Output: " + getElementBrute(arrBrute));

        int[] arrBetter = {4, 4, 5, 6, 4, 5, 5};
        System.out.println("Better (HashMap) Output: " + getElementBetter(arrBetter));

        
        int[] arrOptimal = {1, 2, 2, 1, 2, 1};
        System.out.println("Optimal (Boyer-Moore) Output: " + getElement(arrOptimal));
    }


    public static List<Integer> getElement(int[] arr) {
        int n = arr.length;
        int target = n / 3;
        List<Integer> list = new ArrayList<>();
        int count1 = 0, count2 = 0;
        int element1 = -1, element2 = -1;

        for (int i = 0; i < n; i++) {
            if (count1 == 0 && arr[i] != element2) {
                count1 = 1;
                element1 = arr[i];
            } else if (count2 == 0 && arr[i] != element1) {
                count2 = 1;
                element2 = arr[i];
            } else if (arr[i] == element1) {
                count1++;
            } else if (arr[i] == element2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        int a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element1) {
                a++;
            } else if (arr[i] == element2) {
                b++;
            }
        }
        if (a > target) list.add(element1);
        if (b > target) list.add(element2);
        return list;
    }

    public static List<Integer> getElementBetter(int[] arr) {
        int n = arr.length;
        int target = n / 3;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            if (map.get(arr[i]) > target) {
                list.add(arr[i]);
            }
            if (list.size() == 2) break;
        }
        return list;
    }


    public static List<Integer> getElementBrute(int[] arr) {
        int n = arr.length;
        int target = n / 3;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!list.contains(arr[i])) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == arr[i]) count++;
                }
                if (count > target) {
                    list.add(arr[i]);
                }
            }
        }
        return list;
    }
}
