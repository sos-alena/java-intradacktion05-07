package com.hilel.lesson11;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Random;

public class getCharRandom {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number - the size of source array: ");
        int size = getNumber();
        System.out.println("Enter a number - the size of array final: ");
        int size2 = getNumber();
        int maxBigLetterLat = 91; //ASCII 90+1 [Z];
        int minBigLetterLat = 65; //ASCII 65 [A];
        int maxlowLetterLat = 123; //ASCII 122+1 [z];
        int minlowLetterLat = 97; //ASCII 97 [a];
        int maxNumb = 58; //ASCII 57+1 [9];
        int minNumb = 48; //ASCII 48 [0];
        int maxChar = 96; //ASCII 95+1 ["_"];
        int minChar = 95; //ASCII 95 ["_"];


        char[] str = new char[size2];

        for (int i = 0; i < str.length / 4; i++) {
            char[] bigLetter = getSymbol(maxBigLetterLat, minBigLetterLat, size);
            str[i] = bigLetter[i];
        }

        int j = 0;
        for (int i = str.length / 4; i < str.length / 2; i++, j++) {
            char[] lowLetter = getSymbol(maxlowLetterLat, minlowLetterLat, size);
            str[i] = lowLetter[j];
        }


        int k = 0;
        for (int i = str.length / 2; i < (str.length - str.length / 4); i++, k++) {
            char[] number = getSymbol(maxNumb, minNumb, size);
            str[i] = number[k];
        }


        int g = 0;
        for (int i = (str.length - str.length / 4); i < str.length; i++, g++) {
            char[] symbol = getSymbol(maxChar, minChar, size);
            str[i] = symbol[g];
        }

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }

        System.out.println();


   char[] str2 = new char[str.length];
                  
        int a = 0;
        Random v = new Random();
       for (int i = 0; i < str.length; i++) {
         int index = v.nextInt(i + 1);
            a = str[index];
              str[index] = str[i];
              str2[i] = (char) a;

        }
        for (int i = 0; i < str.length; i+=4) {
            System.out.print(str2[i] + " ");

        }

    }


    public static char[] getSymbol(int max, int min, int size) throws IOException {

        char[] array = new char[size];
        int rand;
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            rand = r.nextInt(max - min) + min;
            array[i] = (char) rand;

        }

        return array;
    }


    public static Integer getNumber() {
       try {
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            System.out.println("Enter number again");
            return getNumber();
        }
    }
}




