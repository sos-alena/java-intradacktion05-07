package com.hillel.classwork.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserNumbers {


    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        System.out.println("Enter size'");
        int[] usnumbers = new int[Integer.parseInt(READER.readLine())];

        System.out.println("Enter numbers: ");
        for (int i = 0; i < usnumbers.length; i++) {
            usnumbers[i] = Integer.parseInt(READER.readLine());

        }

        for (int i = 0; i < usnumbers.length; i++) {
            System.out.print(usnumbers[i] + ",");
            System.out.println();
        }

        int temp = 0;
        for (int i = 0; i < usnumbers.length; i++) {
            if (usnumbers[i] > temp) {
                temp = usnumbers[i];
            }

        }

        System.out.println("Max: " + temp);
    }



}
