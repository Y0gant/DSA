package src.maths;

//Power Exponentiation
public class Maths9 {
    public static void main(String[] args) {
        Maths9 obj = new Maths9();
        System.out.println(obj.power(2, 2));
        System.out.println(obj.power(2, 3));
        System.out.println(obj.power(2, 4));

    }

    public int power(int x, int n) {
        int ans = 1;
        int pow = n;
        n = Math.abs(n);
        if (n == 0) return 1;
        while (n > 0) {
            if (n % 2 == 1) {
                ans *= x;
                n = n - 1;
            } else {
                x *= x;
                n = n / 2;
            }
        }
        if (pow < 0) return 1 / ans;
        return ans;
    }


    //Brute force approach
    public int powerBrute(int x, int n) {
        int ans = 1;
        int pow = n;
        n = Math.abs(n);
        if (n == 0) return 1;
        while (n > 0) {
            ans *= x;
            n--;
        }
        if (pow < 0) return 1 / ans;
        return ans;
    }
}
