package programs.basics.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CountElements {
    private Map<Integer, Integer> hashMap;
    private Map<Character, Integer> charHashMap;

    public Map<Character, Integer> mapElements(String str) {
        charHashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char charIndex = str.charAt(i);

            charHashMap.put(charIndex, charHashMap.getOrDefault(charIndex, 0) + 1);

        }
        return charHashMap;
    }


    public Map<Integer, Integer> mapElements(int[] arr) {
        hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        return hashMap;
    }

    //return specific elements value
    public int getNumber(int n) {
        return hashMap.getOrDefault(n, 0);
    }


}

public class FrequencyCount2 {
    public static void main(String[] args) {
        int[] arr = {38, 37, 17, 32, 9, 24, 36, 27, 16, 9, 12, 19, 8, 30, 33, 27, 28, 32, 40, 40, 27, 12, 11, 7, 22, 35, 12, 16, 34, 30, 4, 32, 14, 26, 33, 21, 28, 40, 36, 25, 24, 2, 1, 13, 10, 7, 19, 11, 25, 19, 14, 32, 6, 4, 1, 13, 20, 26, 24, 21, 24, 9, 2, 4, 27, 3, 19, 12, 16, 21, 20, 26, 35, 29, 16, 33, 30, 36, 33, 39, 19, 23, 11, 37, 24, 20, 18, 24, 5, 18, 36, 9, 6, 2, 35, 6, 28, 28, 34, 30, 15, 23, 40, 34, 29, 9, 30, 26, 39, 1, 11, 17, 19, 11, 4, 40, 32, 40, 24, 23, 36, 25, 21, 24, 32, 4, 18, 28, 6, 4, 7, 26, 36, 21, 8, 3, 2, 20, 32, 36, 15, 23, 10, 32, 32, 15, 31, 14, 23, 9, 6, 33, 34, 11, 37, 23, 6, 34, 36, 35, 13, 15, 11, 39, 10, 36, 20, 2, 40, 4, 20, 38, 40, 17, 12, 16, 40, 9, 27, 25, 9, 5, 32, 22, 18, 25, 10, 21, 12, 32, 7, 38, 40, 31, 40, 19, 4, 10, 19, 8, 40, 29, 17, 33, 25, 19, 8, 11, 29, 30};
        CountElements obj = new CountElements();
        System.out.println(obj.mapElements(arr));
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "=" + obj.getNumber(i));
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println(obj.mapElements(input));
        sc.close();
    }
}
