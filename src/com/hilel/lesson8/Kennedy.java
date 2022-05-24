package com.hilel.lesson8;

public class Kennedy {


    public static void main(String[] args) {


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
