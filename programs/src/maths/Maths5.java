package src.maths;

/**
 * Given a positive integer n,
 * The task is to find the value of Σi F(i)
 * where i is from 1 to n and function F(i) is defined as
 * the sum of all divisors of i.
 */
public class Maths5 {
    public static void main(String[] args) {
        Maths5 obj = new Maths5();
        System.out.println(obj.sumOfDivisors(3));
        System.out.println(obj.sumOfDivisors(5));
        System.out.println(obj.sumOfDivisors(7));
        System.out.println(obj.sumOfDivisors2(2));
        System.out.println(obj.sumOfDivisors2(3));

    }

    public int sumOfDivisors(int n) {
        int addn = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    // System.out.println(j);
                    addn += j;
                }
            }
        }
        return addn;
    }

    public int sumOfDivisors2(int n) {
        int addn = 0;
        for (int i = 1; i <= n; i++) {
            // Add `i` to the sum for all numbers divisible by `i`.
            addn += (n / i) * i;
        }
        return addn;
    }

}
