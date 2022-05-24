package com.hilel.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintArray {



    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = getNumber();

        }

        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ",");


        }
        System.out.print(numbers[numbers.length-1]);
    }

    private static Integer getNumber() {
        try {
            System.out.println("input number:");
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            return getNumber();
        }
    }
}
