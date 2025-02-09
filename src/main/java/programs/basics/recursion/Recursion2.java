package programs.basics.recursion;

//Print from 1 to N using Recursion
public class Recursion2 {
    public static void main(String[] args) {
        Recursion2 obj = new Recursion2();
        obj.printNum(1, 6);
    }

    public void printNum(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        i++;
        printNum(i, n);
    }
}
