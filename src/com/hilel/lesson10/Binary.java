package com.hilel.lesson10;


public class Binary {


    public static void main(String[] args) {

        int i = 45;
        System.out.println(i + " " + Integer.toBinaryString(i));

        int result = ~i;
        System.out.println(result + " " + Integer.toBinaryString(result));

        int i1 = 56;
        System.out.println(i1 + " " + Integer.toBinaryString(i1));

        int and = i & i1;
        System.out.println(and + " " + Integer.toBinaryString(and));

        int or = i | i1;
        System.out.println(or + " " + Integer.toBinaryString(or));


        int mm = 40<<1;
        System.out.println(mm + " " + Integer.toBinaryString(mm));

        int x = 40>>1;
        System.out.println(x + " " + Integer.toBinaryString(x));

    }

}
