package programs.basics.maths;

import java.util.Arrays;


//Sieve of eratosthenes
//Given input n print all prime till n
public class Maths10 {
    public static void main(String[] args) {
        Maths10 obj = new Maths10();
        obj.sieveOfEratosthenes(100);
        obj.sieveOfEratosthenes(50);

    }


    void sieveOfEratosthenes(int n) {
        if (n < 2) return;
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, 2, prime.length, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.println(i);
            }
        }

    }
}
