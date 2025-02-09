package programs.basics.maths;

public class Maths2 {
    public static void main(String[] args) {
        Maths2 obj = new Maths2();
        System.out.println("Reverse");
//        System.out.println(obj.reverse(123));
//        System.out.println(obj.reverse(-123));
//        System.out.println(obj.reverse(726186));
//        System.out.println(obj.reverse(368221));
//        System.out.println(obj.reverse(0));
//        System.out.println(obj.reverse(826876248));
        System.out.println("Reverse 2");
        System.out.println(obj.reverse2(-82));
        System.out.println(obj.reverse2(88));
        System.out.println(obj.reverse2(-76248));
        System.out.println(obj.reverse2(0));
        System.out.println(obj.reverse2(-214748365));
    }

    public int reverse2(int x) {
        if (x == 0) return 0;
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) return 0;
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev;
    }

//    public int reverse(int x) {
//        if (x == 0) return 0;
//        if (x == Integer.MIN_VALUE || x == Integer.MAX_VALUE) return 0;
//        int abs = Math.abs(x);
//        String rev = "";
//        int reversed;
//        while (abs > 0) {
//            rev += abs % 10;
//            abs /= 10;
//        }
//        if (x < 0) rev = "-" + rev;
//        reversed = Integer.parseInt(rev);
//        return reversed;
//    }
}
