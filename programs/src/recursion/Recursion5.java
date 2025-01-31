package src.recursion;

//Print from N to 1 using Recursion using Backtracking
public class Recursion5 {
    public static void main(String[] args) {
        Recursion5 obj = new Recursion5();
        obj.printNumRevBacktrack(1, 6);
    }

    void printNumRevBacktrack(int i, int n) {
        if (i > n) {
            return;
        }
        printNumRevBacktrack(i + 1, n);
        System.out.println(i);
    }

}
