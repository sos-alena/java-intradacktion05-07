package com.hilel.lesson9;

public class CreateArray {


    public static void main(String[] args) {

        int[] numbers = {1, 8, 10, 81, 178, 98, 154, 111, 95};

        int numbers2[] = new int[numbers.length * 2];

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println();

        print(numbers);
        int j = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
                numbers2[j] = numbers[i];
                j += 2;



        }

        System.out.println();
        print(numbers2);




    }

    private static void print(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");

            }
    }


}
