package programs.basics.recursion;

import java.util.Scanner;

// Check if string is palindrome or not
public class Recursion9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter string :");
        String input = obj.nextLine();
        System.out.println(checkPalindrome(input, 0));
    }

    public static boolean checkPalindrome(String str, int start) {
        if (start >= str.length() / 2) {
            return true;
        }
        if (str.charAt(start) != str.charAt(str.length() - 1 - start)) {
            return false;
        }

        return checkPalindrome(str, start + 1);

    }
}
