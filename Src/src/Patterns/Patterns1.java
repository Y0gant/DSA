package src.Patterns;

public class Patterns1 {
    public static void main(String[] args) {
         Patterns1 obj1 = new Patterns1();
        System.out.println("Pattern 1 :");
        obj1.pattern1(3);
        System.out.println("Pattern 2 :");
        obj1.pattern2(4);
        System.out.println("Pattern 3 :");
        obj1.pattern3(4);
        System.out.println("Pattern 4 :");
        obj1.pattern4(4);
        System.out.println("Pattern 5 :");
        obj1.pattern5(5);
        System.out.println("Pattern 6 :");
        obj1.pattern6(5);

    }


        public void pattern6(int n) {
            for (int i = n; i > 0; i--) {
                for (int k = 0; k < i; k++) {
                    System.out.print((k+1)+" ");
                }
                System.out.println();
            }
        }


    public void pattern5(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*" + " ");

            }
            System.out.println();
        }
    }

        public void pattern4(int n) {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print((i+1)+" ");
                }
                System.out.println();
            }
        }


    public void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
    public void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public void pattern1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("*"+" ");

            }
            System.out.println();
        }
    }
}
