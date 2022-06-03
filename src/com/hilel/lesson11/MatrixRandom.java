package com.hilel.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MatrixRandom {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        System.out.println("Enter a number - the size of source array: ");
        int size = 4;
        int size2 = 8;
        int maxBigLetterLat = 91; //ASCII 90+1 [Z];
        int minBigLetterLat = 65; //ASCII 65 [A];
        int maxlowLetterLat = 123; //ASCII 122+1 [z];
        int minlowLetterLat = 97; //ASCII 97 [a];
        int maxNumb = 58; //ASCII 57+1 [9];
        int minNumb = 48; //ASCII 48 [0];
        int maxChar = 96; //ASCII 95+1 ["_"];
        int minChar = 95; //ASCII 95 ["_"];


        char[][] matrix2 = new char[size][size2];

        Random r = new Random();
        for (int i = 0; i < matrix2.length-3; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = (char) ((char) r.nextInt(maxBigLetterLat - minBigLetterLat) + minBigLetterLat);
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        Random r2 = new Random();
        for (int i = 1; i < matrix2.length-2; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {

                matrix2[i][j] = (char) ((char) r2.nextInt(maxlowLetterLat - minlowLetterLat) + minlowLetterLat);
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        Random r3 = new Random();
        for (int i = 2; i < matrix2.length-1; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {

                matrix2[i][j] = (char) ((char) r3.nextInt(maxNumb - minNumb) + minNumb);
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 3; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = '_';
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");

    //    char[][] matrix3 = new char[size2][size];
    //    for (int i = 0; i < matrix3.length; i++) {
    //        for (int j = 0; j < matrix3[i].length; j++) {
    //            matrix3[i][j] = matrix2[j][i];
     //           System.out.print(matrix3[i][j] + " ");
    //        }
     //       System.out.println();
     //   }

        char[] pussvord = new char[size2];
        int random;
        Random r4 = new Random();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                random = (char) r4.nextInt(matrix2[i][j]);
                pussvord[i] = (char) random;
                System.out.print(pussvord[i] + " ");
            }
            System.out.println();

        }


        }

        // char[] bigLetter = getSymbol(maxBigLetterLat, minBigLetterLat, size);
        //  char[] lowLetterLat = getSymbol(maxlowLetterLat, minlowLetterLat, size);
        // char[] Numb = getSymbol(maxNumb, minNumb, size);
        // char[] Char = getSymbol(maxChar, minChar, size);

       // char[][] matrixRandom = getMatrix(maxBigLetterLat, minBigLetterLat, size, size2);
       // System.out.println();

     // for (int i = 0; i < matrix2.length - 1; i++) {
     //  for (int j = 0; j < matrix2[i].length; j++) {

      //  System.out.print(matrix2[i][j] + " ");

        // }

        //  System.out.println();
      // }

    public static char[][] getMatrix(int max, int min, int size, int size2) {
        char[][] matrix = new char[size][size2];

        Random r = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (char) ((char) r.nextInt(max - min) + min);

            }

        }
        return matrix;
    }

    public static char[] getSymbol(int max, int min, int size) throws IOException {

        char[] array = new char[size];
        int rand;
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            rand = r.nextInt(max - min) + min;
            array[i] = (char) rand;

        }

        return array;
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


}
