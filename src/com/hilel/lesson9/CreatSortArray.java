package com.hilel.lesson9;

import java.util.Arrays;
import java.util.Collections;

public class CreatSortArray {

    public static void main(String[] args) {

        Integer[] numbers = {8, 10, 5, 17, 3, 6, 7, 4, 5, 0};

        for (Integer i = 0; i < numbers.length; i++) {



        }


        print(numbers);



        System.out.println();
        Arrays.sort(numbers);
         print(numbers);

        Arrays.sort(numbers, Collections.reverseOrder());


        System.out.println();
        print(numbers);


    }

    private static void print(Integer[] numbers) {
        for (Integer i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " " );
        }
    }
}
