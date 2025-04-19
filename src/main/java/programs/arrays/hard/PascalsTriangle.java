package programs.arrays.hard;

import java.util.ArrayList;

public class PascalsTriangle {
    public static void main(String[] args) {
        // 1. Test pascalsTriangle(int n)
        System.out.println("Full Pascal's Triangle (first 5 rows):");
        ArrayList<ArrayList<Integer>> triangle = pascalsTriangle(5);
        for (ArrayList<Integer> row : triangle) {
            System.out.println(row);
        }

        // 2. Test pascalRowAt(int row)
        int rowNumber = 5;
        System.out.println("\nPascal's Row at index " + rowNumber + " (0-indexed):");
        ArrayList<Integer> rowAt = pascalRowAt(rowNumber);
        System.out.println(rowAt);

        // 3. Test pascalRowAtBrute(int row)
        int bruteRow = 4;
        System.out.println("\nPascal's Row at index " + bruteRow + " (brute force):");
        ArrayList<Integer> bruteRowAt = pascalRowAtBrute(bruteRow);
        System.out.println(bruteRowAt);

        // 4. Test pascalElementAt(int row, int col)
        int elementRow = 5, elementCol = 3;
        int element = pascalElementAt(elementRow, elementCol);
        System.out.println("\nPascal's Element at row " + elementRow + ", column " + elementCol + ": " + element);

        // 5. Test pascalElementAtBrute(int row, int col)
        int bruteElementRow = 6, bruteElementCol = 2;
        long bruteElement = pascalElementAtBrute(bruteElementRow, bruteElementCol);
        System.out.println("\nPascal's Element (brute) at row " + bruteElementRow + ", column " + bruteElementCol + ": " + bruteElement);

        // 6. Test factorial(long n)
        long factNumber = 5;
        long factResult = factorial(factNumber);
        System.out.println("\nFactorial of " + factNumber + ": " + factResult);
    }

    static ArrayList<ArrayList<Integer>> pascalsTriangle(int n) {
        ArrayList<ArrayList<Integer>> pascals = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            pascals.add(pascalRowAt(i));
        }
        return pascals;
    }

    static ArrayList<Integer> pascalRowAt(int row) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        int ncr = 1;
        for (int i = 1; i < row; i++) {
            ncr *= (row - i);
            ncr /= (i);
            ans.add(ncr);
        }
        return ans;
    }

    static ArrayList<Integer> pascalRowAtBrute(int row) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= row; i++) {
            arr.add(pascalElementAt(row, i));
        }
        return arr;
    }

    static int pascalElementAt(int row, int col) {
        row -= 1;
        col -= 1;
        if (col > row || col < 0) return 1;
        int ans = 1;
        for (int i = 0; i < col; i++) {
            ans *= (row - i);
            ans /= (i + 1);
        }
        return ans;
    }

    public static long pascalElementAtBrute(int row, int col) {
        row -= 1;
        col -= 1;
        if (row < col || col < 0) return 1;
        return factorial(row) / (factorial(col) * factorial(row - col));

    }

    static long factorial(long n) {
        long ans = 1;
        for (long i = n; i >= 1; i--) {
            ans *= i;
        }
        return ans;
    }
}
