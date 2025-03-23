package programs.arrays.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> union = unionBrute(arr1, arr2);
        System.out.println(union);
    }
//
//    public static ArrayList<Integer> unionArray(int[] a, int[] b) {
//
//
//    }

    public static ArrayList<Integer> unionBrute(int[] a, int[] b) {
        //Time complexity- O((N+M)log(N+M))(N&M= length of array a&b respectively.)
        //Space complexity- O(N+M)
        HashSet<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }
        for (int j : b) {
            set.add(j);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
