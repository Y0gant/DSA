package src.recursion;

import java.util.Scanner;

//Simple recursion program
//to print a name using user input
public class Recursion1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of times you want to print the name :");
        int n = scan.nextInt();
        printN(n);

    }

    public static void printN(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println("Hello World");
        printN(n - 1);
    }
}
