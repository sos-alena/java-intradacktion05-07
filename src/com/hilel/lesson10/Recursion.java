package com.hilel.lesson10;

public class Recursion {

    public static void main(String[] args) {

        int count = 1;
        for (int i = 1; i < 6; i++) {
           count = count * i;


        }

        System.out.println(count);


        System.out.println(factorial(5 ));
    }

    public static int factorial(int number) {
        if (number == 1) {
            return number;
        }

        return number * factorial(number- 1);

    }
}
