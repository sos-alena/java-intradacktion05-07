package com.hillel.classwork.lesson8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArraySum {


    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {

        int[] numbers = {2, 10, 78, 50, 17};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            sum += numbers[i];

        }
        System.out.println(sum);
    }
}
