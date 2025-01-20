package src.maths;

public class Maths1 {
    int count;

    public static void main(String[] args) {
        Maths1 obj = new Maths1();
        System.out.println("Brute Force Solution:");
        System.out.println(obj.countDigitsBrute(748648752));
        Maths1 obj1 = new Maths1();
        System.out.println("Optimal (Logarithmic) Solution:");
        System.out.println(obj1.countDigits(62876438));
    }

    public int countDigitsBrute(int n) {
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public int countDigits(int n) {
        count = (int) (Math.log10(n) + 1);
        return count;
    }
}
