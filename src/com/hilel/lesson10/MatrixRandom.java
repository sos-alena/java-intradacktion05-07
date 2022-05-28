package com.hilel.lesson10;

public class MatrixRandom {


    public static void main(String[] args) {

        int[][] random = new int[3][5];

        int temp = 1;
        int count = 0;
        for (int i = 0; i < random.length; i++) {
            for (int j = 0; j < random[i].length; j++) {
                random[i][j] = (int) (Math.random() * 10);
              count += random[i][j];
              temp *= random[i][j];
            }

        }

        PrintTwoDimensionalArray(random);
        System.out.println(count);
        System.out.println(temp);

    }
    public static void PrintTwoDimensionalArray(int[][] transposing) {

        for (int[] ints : transposing) {

            for (int anInt : ints) {

                System.out.print(" " + anInt);

            }
            System.out.println();

        }

    }

}
