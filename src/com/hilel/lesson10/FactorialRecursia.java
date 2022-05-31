package com.hilel.lesson10;

public class FactorialRecursia {

    public static void main(String[] args) {


        int n = (int) (Math.random() * 10);
        System.out.println(n);
        System.out.println(factorial(n));


        System.out.println(factorial2(15) + "!");

    }
    private static int factorial(int n) {

        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n-1);
        return result;
    }
    private static int factorial2(int n) {
        int result = 1;

        if (n == 0) {
            System.out.print(" = ");
            return result;
        }
        if (n == 1) {
            System.out.print(" * 1 = ");
            return result;
        }

        System.out.print(n);
        if (n != 2) {
            System.out.print(" * ");
        }

        result = n * factorial(n-1);
        return result;
    }



}
