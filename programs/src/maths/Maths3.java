package src.maths;

public class Maths3 {
    public static void main(String[] args) {
        Maths3 obj = new Maths3();
        System.out.println(obj.isPalindrome(121));
        System.out.println(obj.isPalindrome(-121));
        System.out.println(obj.isPalindrome(0));
        System.out.println(obj.isPalindrome(123));
        System.out.println(obj.isPalindrome(1000000001));

    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int rev = 0;
        int temp = x;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return x == rev;
    }
}
