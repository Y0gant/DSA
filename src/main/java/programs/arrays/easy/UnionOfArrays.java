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

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 17, 18};
        int[] arr4 = {2, 3, 4, 4, 5, 11, 12, 20, 21, 22, 22, 26};
        ArrayList<Integer> union2 = unionArray(arr3, arr4);
        System.out.println(union2);

    }

    public static ArrayList<Integer> unionArray(int[] a, int[] b) {

        int i = 0, j = 0;
        int n = a.length;
        int m = b.length;
        ArrayList<Integer> Union = new ArrayList<>();
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                if (Union.isEmpty() || Union.getLast() != a[i])
                    Union.add(a[i]);
                i++;
            } else {
                if (Union.isEmpty() || Union.getLast() != b[j])
                    Union.add(b[j]);
                j++;
            }
        }
        while (i < n) {
            if (Union.getLast() != a[i])
                Union.add(a[i]);
            i++;
        }
        while (j < m) {
            if (Union.getLast() != b[j])
                Union.add(b[j]);
            j++;
        }
        return Union;

    }

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
