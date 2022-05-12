package com.hilel.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferRider {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        System.out.println("as string: " + str);

        Double d = Double.parseDouble(str);
        System.out.println("as double:" + d);

        Integer i = Integer.parseInt(str);
        System.out.println("as int: " + i);

        int m = Integer.parseInt(str);
        System.out.println("as int: " + m);


    }
}
