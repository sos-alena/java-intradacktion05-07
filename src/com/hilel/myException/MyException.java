package com.hilel.myException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyException extends Throwable {

        public static String input() throws IOException {

            BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

                try {
                    String str = READER.readLine();

            return str;

                } catch (Exception IllegalArgumentException) {
                    System.out.println("Error: " + IllegalArgumentException.getMessage());
                    System.out.println("Enter str again");
                    return input();
                }
            }


}
