package src.maths;

public class Maths4 {
    public static void main(String[] args) {
        Maths4 obj = new Maths4();
        System.out.println(obj.armstrongNumber(153));
        System.out.println(obj.armstrongNumber(1634));
        System.out.println(obj.armstrongNumber(34));
        System.out.println(obj.armstrongNumber(324));
    }

    boolean armstrongNumber(int n) {
        int arm = 0;
        int temp = n;
        int count = (int) (Math.log10(n) + 1);
        while (temp > 0) {
            arm = (int) (arm + Math.pow(temp % 10, count));
            temp /= 10;
        }
        return arm == n;
    }
}
