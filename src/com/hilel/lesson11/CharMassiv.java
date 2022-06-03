package com.hilel.lesson11;

import java.util.Arrays;

public class CharMassiv {

    public static void main(String[] args) {

        int maxBigLetterLat = 91; //ASCII 90+1 [Z];
        int minBigLetterLat = 65; //ASCII 65 [A];
        int maxlowLetterLat = 123; //ASCII 122+1 [z];
        int minlowLetterLat = 97; //ASCII 97 [a];
        int maxNumb = 58; //ASCII 57+1 [9];
        int minNumb = 48; //ASCII 48 [0];
        int maxChar = 96; //ASCII 95+1 ["_"];
        int minChar = 95; //ASCII 95 ["_"];

        char[] Letter = {95, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};


        System.out.println(Arrays.toString(Letter));


        System.out.println("-------------------------------------------");


        String str = new String(Letter, 11, 26);
        System.out.println("Bib Letter: " + Arrays.toString(new String[]{str}));
        String str2 = new String(Letter, 37, 26);
        System.out.println("Low Letter: " + Arrays.toString(new String[]{str2}));
        String str3 = new String(Letter, 1, 10);
        System.out.println("Low Letter: " + Arrays.toString(new String[]{str3}));
        System.out.println("underscore: " + Letter[0]);


        System.out.println("______________________________________________");




       char[] symbols = getSymbols();
        System.out.println(Arrays.toString(symbols));

    }

    private static char[] getSymbols() {
        char[] arrays = new char[63];
        for (int i = 0; i < 1; i++) {
            arrays[i] = (char) 95;

        }
        char numb = 48;
        for (int i = 1; i < 11; i++) {

            arrays[i] = numb;
            numb++;

        }

        char bigLetter = 65;
        for (int i = 11; i < 37; i++) {

            arrays[i] = bigLetter;
            bigLetter++;


        }
        char lowLetter = 97;
        for (int i = 37; i < arrays.length; i++) {

            arrays[i] = lowLetter;
            lowLetter++;


        }

        return arrays;
    }
}

