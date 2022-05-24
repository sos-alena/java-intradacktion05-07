package com.hilel.lesson9;

import java.util.Arrays;

import static com.hilel.lesson9.ArraySort.fill;

public class CopyArray {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        fill(numbers);
        System.out.println(Arrays.toString(numbers));
        int[] array = Arrays.copyOf(numbers, 20);
        System.out.println(Arrays.toString(array));

    }
}
