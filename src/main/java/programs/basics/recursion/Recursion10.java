package programs.basics.recursion;

//Program to get and print fibonacci series
public class Recursion10 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(getFibonacci(i) + " ");
        }
    }

    public static int getFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
