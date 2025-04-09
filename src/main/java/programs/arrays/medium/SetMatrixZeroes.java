package programs.arrays.medium;


import java.util.Arrays;

public class SetMatrixZeroes {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        System.out.println("Before Brute Force:");
        printMatrix(matrix1);
        setZeroesBrute(matrix1);
        System.out.println("After Brute Force:");
        printMatrix(matrix1);

        int[][] matrix2 = {
                {0, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("\nBefore Better Approach:");
        printMatrix(matrix2);
        setZeroesBetter(matrix2);
        System.out.println("After Better Approach:");
        printMatrix(matrix2);

        int[][] matrix3 = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };
        System.out.println("\nBefore Optimal Approach:");
        printMatrix(matrix3);
        setZeroesOptimal(matrix3);
        System.out.println("After Optimal Approach:");
        printMatrix(matrix3);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void setZeroesOptimal(int[][] matrix) {
        int col0 = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j != 0) matrix[0][j] = 0;
                    else col0 = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        if (col0 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

    }


    public static void setZeroesBetter(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (row[i] || column[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

    }


    public static void setZeroesBrute(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix, i);
                    markColumn(matrix, j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void markColumn(int[][] matrix, int j) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][j] = -1;
        }
    }

    private static void markRow(int[][] matrix, int i) {
        for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = -1;
        }
    }
}
