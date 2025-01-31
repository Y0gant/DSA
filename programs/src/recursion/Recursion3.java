package src.recursion;

//Print from N to 1 using Recursion
public class Recursion3 {
    public static void main(String[] args) {
        Recursion3 obj = new Recursion3();
        int n;
        n = 6;
        System.out.println("Printing numbers from " + n + " to 1 :");
        obj.printNumRev(n);
    }

    void printNumRev(int n) {
        if (1 > n) {
            return;
        }
        System.out.println(n);
        printNumRev(n - 1);
    }
}
