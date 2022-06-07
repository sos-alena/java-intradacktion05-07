package com.hilel.lesson11;


import java.util.Arrays;

public class PussvordShuffle {
    public static void main(String[] args) {



// создадим массив и перемешаем его
        int[] mSolutionArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
                13, 14 };


        System.out.println("Array" + Arrays.toString(shuffleArray(mSolutionArray)));

    }

    static int[] shuffleArray(int[] mSolutionArray) {
        int index;
        for (int i = 0; i < mSolutionArray.length; i++) {
            index = (int) (Math.random() * mSolutionArray.length);
            int a = mSolutionArray[index];
            mSolutionArray[index] = mSolutionArray[i];
            mSolutionArray[i] = a;
        }

        return mSolutionArray;
    }
}







