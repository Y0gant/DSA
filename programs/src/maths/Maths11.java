package src.maths;

import java.util.Arrays;

// Count prime in given range
public class Maths11 {
    public static void main(String[] args) {
        Maths11 obj = new Maths11();
        System.out.println(obj.countPrimes(2, 20));
        System.out.println(obj.countPrimes2(2, 50));
        System.out.println(obj.countPrimes3(2, 100));
    }

    //Optimization 2
    public int countPrimes3(int n, int m) {
        Maths11 obj = new Maths11();
        int count = 0;
        if (n <= 0 || m <= 0 || n > m) {
            System.out.println("Invalid Input");
            return count;
        }
        //using pre sum
        int[] arr = obj.getSieve(m);
        for (int i = n; i <= m; i++) {
            arr[i] += arr[i - 1];
        }
        return arr[m];
    }

    //Optimization 1
    public int countPrimes2(int n, int m) {
        Maths11 obj = new Maths11();
        int count = 0;
        if (n <= 0 || m <= 0 || n > m) {
            System.out.println("Invalid Input");
            return count;
        }
        for (int i = n; i <= m; i++) {
            if (obj.isPrimesUsingSieve(i)) {
                count++;
//                System.out.println(i);
            }
        }
        return count;
    }


    //Brute force
    public int countPrimes(int n, int m) {
        Maths6 obj = new Maths6();
        int count = 0;
        if (n <= 0 || m <= 0 || n > m) {
            System.out.println("Invalid Input");
            return count;
        }
        for (int i = n; i <= m; i++) {
            if (obj.isPrime2(i).equals("YES")) {
                count++;
//                System.out.println(i);
            }
        }
        return count;
    }

    //get boolean sieve
    public boolean isPrimesUsingSieve(int n) {
        if (n <= 1) {
            return false;
        }
        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, 2, arr.length, true);
        arr[0] = arr[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }
        return arr[n];
    }

    //get pre summed sieve
    int[] getSieve(int n) {
        int[] prime = new int[n + 1];
        Arrays.fill(prime, 2, prime.length, 1);
        prime[0] = prime[1] = 0;
        for (int i = 2; i * i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = 0;
                }
            }
        }
        return prime;
    }
}

