package com.hilel.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BooleanVariable {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        String message = "Your number is ";
        if (isEven(number)) {
            message += "even";
        } else {
            message += "odd";;
        }
        System.out.println(message);
    }

    public static boolean isEven(int number) {
        if (number % 2 != 0) {

            return true;

        } else {
            return false;
        }
    }
}