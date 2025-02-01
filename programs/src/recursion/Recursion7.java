package src.recursion;

public class Recursion7 {
    public static void main(String[] args) {
        Recursion7 obj = new Recursion7();
        System.out.println(obj.factorial(5));
    }

    int factorial(int n) {
        if (n < 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
