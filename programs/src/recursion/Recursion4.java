package src.recursion;

//Print from 1 to N using Recursion using Backtracking.
public class Recursion4 {

    public static void main(String[] args) {
        Recursion4 obj = new Recursion4();
        obj.printNumBacktrack(6);
    }

    void printNumBacktrack(int n) {
        if (n < 1) {
            return;
        }
        printNumBacktrack(n - 1);
        System.out.println(n);

    }
}
