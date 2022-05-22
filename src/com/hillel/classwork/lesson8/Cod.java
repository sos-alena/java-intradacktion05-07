package com.hillel.classwork.lesson8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cod {


    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {

       
        int numb = 9407;
        int units = numb % 100;
        int dozens = (numb / 10) % 10;
        int hundreds = (numb / 10) / 10 % 10;
        int thousands = (numb / 10) / 10 / 10 % 10;
        System.out.println(units);
        System.out.println(dozens);
        System.out.println(hundreds);
        System.out.println(thousands);

        int numbers[] = {thousands, hundreds, dozens, units};
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j <= 9; j++) {
                counter++;
                if (numbers[i] == j) {

                    System.out.println("yor number: " + j);
                    break;
                }


            }


        }
        System.out.println();
        System.out.println("Number of iterations: " + counter);
    }
}
