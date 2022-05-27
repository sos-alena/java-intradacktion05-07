package com.hilel.lesson10;

public class Matrix {

    public static void main(String[] args) {

        int[][] arr = new int[2][3];


        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
           arr [i][j] = (int) (Math.random() * 10);

                System.out.print("(" + i + ", " + j + ")" + " has value: " + arr[i][j] + "; ");

            }
            System.out.println();
        }

        boolean[][][] array = new boolean[4][5][10];

        array[2][3][7] = true;


        for (int i = 0; i < array.length; i++) {
            System.out.println("Level: " + i);
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {

                    System.out.print(array[i][j][k]);

                }

                System.out.println();
                
            }
            System.out.println();
        }
    }

   

    

}
