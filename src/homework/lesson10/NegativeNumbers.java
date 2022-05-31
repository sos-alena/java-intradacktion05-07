package homework.lesson10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NegativeNumbers {


    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        System.out.println("Enter the number of matrix lines: ");
        int line = getNumber();
        System.out.println("Enter the number of matrix columns: ");
        int column = getNumber();
        System.out.println("Enter number min (negative number): ");
        int min = getNumber();
        System.out.println("Enter number max (positive number): ");
        int max = getNumber();

        int[][] matrix = createAndFillMatrix(line, column, max, min);

        System.out.println("----------------------------------");
        System.out.println("Source Matrix: ");
        System.out.println("-----------------------------------");

        printTwoDimensionalArray(matrix);

        System.out.println("-----------------------------------");
        printNegativeNumb(matrix);

    }
    private static void printNegativeNumb(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] < 0) {
                    System.out.println("Cell number: " + "[" + i + "]" + "[" + j + "]" + " " + matrix[i][j]);
                }

            }

        }
    }
    public static int[][] createAndFillMatrix(int n, int m, int max, int min) {
        int[][] matrix = new int[n][m];
        System.out.println("Fill in the matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * (max - min) + min);

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
    public static void printTwoDimensionalArray(int[][] transposing) {

        for (int[] ints : transposing) {
            for (int anInt : ints) {
                System.out.printf("%4d", anInt);

            }
            System.out.println();

        }
    }
}
