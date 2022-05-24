package com.hilel.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Massive {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {



       System.out.println("Input array size: ");
        int[] numbers = new int[Integer.parseInt(READER.readLine())];

      /*  int num = numbers[0];
        System.out.println(num);


        numbers[3] = 500;
        System.out.println(numbers[3]);*/

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("input " + i + " number");
            numbers[i] = Integer.parseInt(READER.readLine());

        }

        printArray(numbers); ///Вызываем метод вывода массива

        System.out.println(numbers);
    }



    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " index: " + array[i]);
        }

    }
}

