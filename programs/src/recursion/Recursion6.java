package src.recursion;

//Given a number ‘N’, find out the sum of the first N natural numbers.
public class Recursion6 {

    public static void main(String[] args) {
        Recursion6 obj = new Recursion6();
        obj.addNumber(5, 0);

    }

    void addNumber(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        addNumber(n - 1, sum + n);
    }
}
