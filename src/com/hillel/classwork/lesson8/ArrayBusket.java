package com.hillel.classwork.lesson8;

public class ArrayBusket {

    public static void main(String[] args) {


        int[] members = {10, 15, 14, 21, 52, 17, 1, 3, 40, 50};

        int sum = 0;
        for (int i = 0; i < members.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Основной состав: " + members[i]);
                sum += members[i];
            }


        }
        System.out.println("Основной состав чумма очков " + sum);

        int sum1 = 0;
        for (int i = 1; i < members.length; i++) {
            if (i % 2 > 0) {
                System.out.println("Запасной состав: " + members[i]);
                sum1 += members[i];
            }


        }

        System.out.println("Запасной состав состав чумма очков " + sum1);

        if (sum > sum1) {
            int result = sum - sum1;
            System.out.println("sum " + sum + "sum1" + sum1);
            System.out.println("Победил основной состав на:" + result + "очков");

        } else {
            int result2 = sum1 - sum;
            System.out.println("sum1 " + sum1 + "sum " + sum);
            System.out.println("Победил запасной состав на: " + result2 + "очков");
        }

    }
}