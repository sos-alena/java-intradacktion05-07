package com.hilel.Lesson3;

public class TypeCasting {

    public static void main(String[] args) {

        byte b = 127;
        System.out.println("byte " + b);

        short sh = b;
        System.out.println("short " + sh);

        int i = 2_000_000;
        System.out.println("int " + i);

        b = (byte) i;
        System.out.println("byte " + b);

        float f = 34.37f;
        byte FloatToByte = (byte) f;
        System.out.println("FloatToByte" + FloatToByte);


    }


}

