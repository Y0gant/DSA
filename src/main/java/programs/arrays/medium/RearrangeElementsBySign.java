package programs.arrays.medium;

import java.util.ArrayList;

public class RearrangeElementsBySign {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, -2, -5};
        System.out.print("Brute Force Method Output: ");
        int[] bruteResult = rearrangeElementsBrute(arr1);
        for (int i : bruteResult) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] arr2 = {3, 1, -2, -5, 2, -4};
        System.out.print("Optimal Method Output: ");
        int[] optimalResult = rearrangeElements(arr2);
        for (int i : optimalResult) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] arr3 = {4, -1, 2, 4, 3, 5, -2, 3, -3, 5};
        System.out.print("Unequal Lengths Method Output: ");
        int[] unequalResult = rearrangeElementsUnequals(arr3);
        for (int i : unequalResult) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] rearrangeElementsUnequals(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else neg.add(arr[i]);
        }

        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                ans[i * 2] = pos.get(i);
                ans[i * 2 + 1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                ans[index] = pos.get(i);
                index++;
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                ans[i * 2] = pos.get(i);
                ans[i * 2 + 1] = neg.get(i);
            }
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                ans[index] = neg.get(i);
            }
        }
        return ans;
    }

    public static int[] rearrangeElements(int[] arr) {
        int pos = 0, neg = 1;
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans[pos] = arr[i];
                pos += 2;
            } else {
                ans[neg] = arr[i];
                neg += 2;
            }
        }
        return ans;
    }

    public static int[] rearrangeElementsBrute(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else neg.add(arr[i]);
        }

        for (int i = 0; i < ans.length / 2; i++) {
            ans[i * 2] = pos.get(i);
            ans[i * 2 + 1] = neg.get(i);
        }
        return ans;
    }
}
