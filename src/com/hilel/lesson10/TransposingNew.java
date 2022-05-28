package com.hilel.lesson10;

public class TransposingNew {

    public static void main(String[] args) {

        int[][] arr = new int[5][10];
        int[][] arrCopy = new int[10][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);

                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < arrCopy.length; i++) {
            for (int j = 0; j < arrCopy[i].length; j++) {
                arrCopy[i][j] = arr[j][i];
                System.out.printf("%4d", arrCopy[i][j]);
            }

            System.out.println();
        }

    }
}
