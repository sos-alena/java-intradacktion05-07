package com.hilel.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ternaryOperations {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());


        // услове ? это значение : другое значение



        String msg = isEven(number)
                ? "Your number is Even"
                : "Your number is Odd";

        System.out.println(msg);
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {

            return true;

        } else {
            return false;
        }
    }
}



