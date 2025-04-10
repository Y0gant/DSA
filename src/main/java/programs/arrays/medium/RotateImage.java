package programs.arrays.medium;

import java.util.Arrays;

public class RotateImage {


    public static void main(String[] args) {
        RotateImage ri = new RotateImage();

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
        };

        System.out.println("Original Matrix for Brute Force Rotation:");
        printMatrix(matrix1);
        ri.rotateBrute(matrix1);
        System.out.println("Matrix after Brute Force Rotation:");
        printMatrix(matrix1);

        System.out.println("\nOriginal Matrix for Optimal Rotation:");
        printMatrix(matrix2);
        ri.rotateOptimal(matrix2);
        System.out.println("Matrix after Optimal Rotation:");
        printMatrix(matrix2);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public void rotateOptimal(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                swap(matrix, i, j);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int start = 0, end = matrix[i].length - 1;
            while (start <= end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    public void rotateBrute(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans[i][j] = matrix[matrix.length - 1 - j][i];
                //ans[j][matrix.length-1-i]=matrix[i][j];
            }
        }
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                matrix[i][j] = ans[i][j];
            }
        }
    }


}

