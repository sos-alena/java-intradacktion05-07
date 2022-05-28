package homework.lesson10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TransposeMatrix {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        System.out.println("Enter the number of matrix lines: ");
        int line = getNumber();
        System.out.println("Enter the number of matrix columns: ");
        int column = getNumber();

        int[][] matrix = createAndFillMatrix(line, column);

        System.out.println("----------------------------------");
        System.out.println("Source Matrix: ");
        System.out.println("-----------------------------------");
        PrintTwoDimensionalArray(matrix);

        int[][] transMatrix = transposeMatrix(matrix, line, column);

        System.out.println("----------------------------------");
        System.out.println("Transposed matrix: ");
        System.out.println("-----------------------------------");
        PrintTwoDimensionalArray(transMatrix);

    }

    public static int[][] transposeMatrix(int[][] matrix, int n, int m) {
        int[][] result = new int[m][n];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix[j][i];

            }

        }
        return result;
    }

    private static int[][] createAndFillMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
        System.out.println("Fill in the matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = getNumber();

            }

        }
        return matrix;
    }


    public static Integer getNumber() {
        try {
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            System.out.println("Enter number again");
            return getNumber();
        }
    }

    public static void PrintTwoDimensionalArray(int[][] transposing) {

        for (int[] ints : transposing) {
            for (int anInt : ints) {
                System.out.printf("%4d", anInt);

            }
            System.out.println();

        }
    }
}