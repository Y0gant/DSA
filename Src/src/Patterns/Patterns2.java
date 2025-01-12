package src.Patterns;

public class Patterns2 {
    public static void main(String[] args) {
        Patterns2 obj =new Patterns2();
        System.out.println("Pattern 7 :");
        obj.pattern7(6);
        System.out.println("Pattern 8 :");
        obj.pattern8(5);
        System.out.println("Pattern 9 :");
        obj.pattern9(4);
        System.out.println("Pattern 10 :");
        obj.pattern10(5);
        System.out.println("Pattern 11 :");
        obj.pattern11(7);
        System.out.println("Pattern 12 :");
        obj.pattern12(5);
        System.out.println("Pattern 13 :");
        obj.pattern13(7);
        System.out.println("Pattern 14 :");
        obj.pattern14(7);
        System.out.println("Pattern 15 :");
        obj.pattern15(7);

    }
    public void pattern15(int n) {
        for (int i = 0; i <n; i++) {
            for(char j = 'A'; j<= 'A'+(n-i-1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern14(int n) {
        for (int i = 0; i <n; i++) {
            for (char j = 'A'; j <='A'+i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void pattern13(int n) {
        int count=1;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public void pattern12(int n) {
        int space =2*(n-1);
        for (int i = 0; i <n; i++) {
            //1st part
            for (int j = 0; j <=i; j++) {
                System.out.print(j+1);
            }
            //2nd part
            for (int j = 0; j <space; j++) {
                System.out.print(" ");
            }
            //3rd part
            for (int j = i; j >=0; j--) {
                System.out.print(j+1);
            }
            System.out.println();
            space-=2;
        }
    }
    public void pattern11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int k=(i+j)%2;
                if (k==0) {
                    System.out.print("1 ");
                }
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public void pattern10(int n) {

        for (int i = 0; i < n*2; i++) {
            int stars =i;
            if (i>n){
                stars=2*n-i;
                }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <=i; j++) {
//                System.out.print("*");
//            }
//            for (int k = 0; k <n-1-i; k++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//        for (int a = 0; a < n; a++) {
//            for (int d = n-1; d >a ; d--) {
//                System.out.print("*");
//            }
//            for (int s = 0; s < a; s++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
   }
    public void pattern9(int n) {
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2+1; k++) {
                System.out.print("*");
            }
            for (int l = 0; l<n-1-i; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int a = 0; a < n; a++) {
            for (int s = 0; s <a; s++) {
                System.out.print(" ");
            }
            for (int w = 0; w <2*n-(2*a+1); w++) {
                System.out.print("*");
            }
            for (int d = 0; d <a; d++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j =0; j <i ; j++) {
                System.out.print(" ");
            }
            for(int k=0;k<2*n-(2*i+1);k++){
                System.out.print("*");
            }
            for (int l = 0; l<i ; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void pattern7(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-1)-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <2*i+1; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < (n-1)-i; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}