package programs.arrays.medium;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> leadersOptimized = findLeaders(arr1);
        System.out.println("Leaders using optimized method: " + leadersOptimized);

        int[] arr2 = {7, 10, 4, 10, 6, 5, 2};
        ArrayList<Integer> leadersBrute = findLeadersBrute(arr2);
        System.out.println("Leaders using brute-force method: " + leadersBrute);
    }

    public static ArrayList<Integer> findLeaders(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                list.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }


    public static ArrayList<Integer> findLeadersBrute(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}
