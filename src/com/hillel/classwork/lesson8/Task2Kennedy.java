package com.hillel.classwork.lesson8;

import java.util.Random;

public class Task2Kennedy {


    public static void main(String[] args) {

        /*В убийстве Кеннеди есть 10 подозреваемых.
        Для каждого установлена вероятность того, что он является убийцей.
        Вероятности записаны в массив чисел. Определить номер подозреваемого
         с самой большой вероятностью.
          */

        int numbers[] = new int[10];
        int temp = 0;
        int killer = 1;

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = (int) (Math.random() * 100);
            System.out.println(numbers[i]);
            if (numbers[i] > temp) {

                temp = numbers[i];
                killer = i+1;
            }

        }

        System.out.println("Вероятность " + temp);
        System.out.println(killer);
    }
}