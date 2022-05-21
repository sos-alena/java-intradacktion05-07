package com.hillel.classwork.lesson8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cod {


    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {

        /* Реалізувати механізм підбору чотирицифрового коду. Вивести в консоль кількість ітерацій.

Наприклад, ми маємо pin = 9407, за скільки ітерацій програма підбере код.

Цикли, масиви, іфи і тд. */

      /*  int numbers[] = new int[4];



        for (int i = 0; i < 9; i++) {

            System.out.println(i);

        }*/

        int numb = 9407;
        int unit = numb % 100;
        int dozens = (numb / 10) % 10;
        int handrezd = (numb / 10) / 10 % 10;
        int thouzend = (numb / 10) / 10 / 10 % 10;
        System.out.println(unit);
        System.out.println(dozens);
        System.out.println(handrezd);
        System.out.println(thouzend);

        int numbers[] = {thouzend, handrezd, dozens, unit};
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j <= 9; j++) {
                counter++;
                if (numbers[i] == j) {

                    System.out.println("yor number: " + j);
                    break;
                }


            }


        }
        System.out.println(counter);
    }
}
