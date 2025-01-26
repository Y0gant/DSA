package src.recursion;

//Simple recursion program
//to print "Hello World"
public class Recursion1 {
    public static void main(String[] args) {
        printN(5);

    }

    public static void printN(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println("Hello World");
        printN(n - 1);
    }
}
