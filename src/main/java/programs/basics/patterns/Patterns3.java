package programs.basics.patterns;

public class Patterns3 {
    public static void main(String[] args) {
        Patterns3 obj = new Patterns3();
        System.out.println("Pattern 16 :");
        obj.pattern16(5);
        System.out.println("Pattern 17 :");
        obj.pattern17(5);
        System.out.println("Pattern 18 :");
        obj.pattern18(5);
        System.out.println("Pattern 19 :");
        obj.pattern19(5);
        System.out.println("Pattern 20 :");
        obj.pattern20(5);
        System.out.println("Pattern 21 :");
        obj.pattern21(5);
        System.out.println("Pattern 22 :");
        obj.pattern22(5);
    }

    public void pattern22(int n) {
        for (int i = 0; i < n * 2 - 1; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(right, left)));
            }
            System.out.println();
        }
    }

    public void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public void pattern20(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n) spaces -= 2;
            else spaces += 2;
        }
    }

    public void pattern19(int n) {
        int inits = 0;
        for (int i = 0; i < n; i++) {
            //stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            //space2
            for (int j = 0; j < inits; j++) {
                System.out.print(" ");

            }
            //star
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            inits += 2;
            System.out.println();
        }
        //2nd part
        int space2 = 2 * (n - 1);
        for (int i = 0; i < n; i++) {
            //1st part
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            //2nd part
            for (int j = 0; j < space2; j++) {
                System.out.print(" ");
            }
            //3rd part
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            space2 -= 2;
        }

    }

    public void pattern18(int n) {

        for (int i = 0; i < n; i++) {
            int ch = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (ch + (n - i - 1)) + " ");
                ch++;
            }
            System.out.println();
        }
    }


    public void pattern17(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (i * 2 + 1) / 2;
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print(ch);
                if (j < breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
