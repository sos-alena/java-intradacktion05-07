package com.hilel.lesson11;


import java.util.Arrays;
import java.util.Random;

public class PussvordShuffle {
    public static void main(String[] args) {



// создадим массив и перемешаем его
        int[] mSolutionArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
                13, 14 };
        shuffleArray(mSolutionArray);

        System.out.println("Array" + Arrays.toString(mSolutionArray));



    }

    static void shuffleArray(int[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}







