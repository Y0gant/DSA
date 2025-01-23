package src.maths;

public class Maths7 {
    public static void main(String[] args) {
        Maths7 obj = new Maths7();
        int[] arr = obj.lcmAndGcd(10, 20);
        int[] arr2 = obj.lcmAndGcd(20, 40);
        int[] arr3 = obj.lcmAndGcd(9, 14);
        for (int i : arr) System.out.print(i + " ");
        for (int i : arr2) System.out.print(i + " ");
        for (int i : arr3) System.out.print(i + " ");
        System.out.println();
        System.out.println(obj.gcd(10, 20));
        System.out.println(obj.gcd(20, 40));
        System.out.println(obj.gcd(9, 14));
    }

    public int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) return b;
        return a;
    }

    public int[] lcmAndGcd(int a, int b) {
        int[] GCD = new int[2];
//        for (int i = 1; i <= Math.min(a, b); i++) {
//            if (a % i == 0 || b % i == 0) {
//                GCD[0] = i;
//                break;
//            }
//        }
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                GCD[1] = i;
                break;
            }
        }
        GCD[0] = a * b / GCD[1];
        return GCD;
    }
}
