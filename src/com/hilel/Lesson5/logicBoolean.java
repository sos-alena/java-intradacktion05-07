package com.hilel.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class logicBoolean {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean booleanValue = Boolean.parseBoolean(reader.readLine());

        if (!booleanValue) {
            System.out.println("You are winner");
        }

else {
            System.out.println("You are false");
        }
    }
}
