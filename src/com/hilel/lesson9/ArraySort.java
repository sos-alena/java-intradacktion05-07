package com.hilel.lesson9;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        int[] numbers = new int[1000];

        fill(numbers);

        long start = System.currentTimeMillis();
        Arrays.sort(numbers);
        //bobbleSort(numbers);

        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));


         //   for (int i = 0; i < numbers.length; i++) {
         //   System.out.println(numbers[i]);
         //
        }

    public static int[] fill(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);

        }
        return numbers;
    }

    private static void bobbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length-i; j++) {

            if (numbers[j] > numbers[i]) {
                int temp = numbers[j];
                numbers[j] = numbers[i];
                numbers[i] = temp;
            }
        }
    }

    }


}


