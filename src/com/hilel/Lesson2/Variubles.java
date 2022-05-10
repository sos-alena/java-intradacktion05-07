package com.hilel.Lesson2;

public class Variubles {

    /*
        psvm - creat main mathod
        sout - print to console
        ctrl+alt+L - format code
         */
    public static void main(String[] args) {

        //sout
        byte myByte = 50;
        System.out.println(myByte);

        short myShort = 11000;
        System.out.println(myShort);

        int result = myByte + myShort;
        System.out.println(result);

        int myInt = 2_000_300;
        System.out.println(myInt);

        long myLong = 110_000_100_100L;
        System.out.println(myLong);

        float myFloat = 11.1F;
        System.out.println(myFloat);

        double myDouble = 1231246.412321332;
        System.out.print(myDouble);

        boolean isvalid = false;
        System.out.println(isvalid);

        char myChar = '&';
        System.out.println(myChar);

        char myChar2 = 89;
        System.out.println(myChar2);

        char myChar3 = '\u0054';
        System.out.println(myChar3);
    }
}
