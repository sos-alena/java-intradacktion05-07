package com.hilel.lesson16;

public class Increment {
    public static void main(String[] args) {

        int x = 5, y = 5;
        System.out.println(x + " " + y); // 5: 5
        System.out.println(++x + " " + --y); // 6 ; 4
        System.out.println(x + " " + y); // 6 : 4
        System.out.println(x++ + " " + y--); // 6 ; 4
        System.out.println(x + " " + y); // 7 / 3
    }
}

