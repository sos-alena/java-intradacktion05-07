package com.hilel.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Validate {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if (!isNamberValid(number)) {
            System.out.println("Error.Number si invalid");
            return;
        }
        System.out.println("You are win");


    }

    public static boolean isNamberValid(int number) {
        if (number % 2 != 0) {

            return true;

        } else {
            return false;
        }
    }
}