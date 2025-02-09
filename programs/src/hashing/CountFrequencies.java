package src.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountFrequencies {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 3, 3, 4, 4, 4, 5, 6, 6, 6};
        CountFrequencies count = new CountFrequencies();
        System.out.println(count.frequencyCount(arr));
    }

    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        List<Integer> hashArr = new ArrayList<>(Collections.nCopies(n, 0));
        for (int i = 0; i < n; i++) {
            int num = arr[i]; // Get the number at index i
            if (num >= 1 && num <= n) {
                hashArr.set(num - 1, hashArr.get(num - 1) + 1);
            }
        }
        return hashArr;
    }
}
