package com.hilel.lesson14;

public class searshNumber {

    public static void main(String[] args) {

        int[] arayy = {0, 10, 15, 7, 8, 9, 20, 27, 20};

        int n = 35;


        int Count = 0;
            for (int i = 0; i < arayy.length; i++) {
                for (int k = 1; k < arayy.length-1; k++) {
                    if ((arayy[i] + arayy[k]) == n) {
                        if (k > i) {
                            System.out.println(i + " - index " + arayy[i] + " - value " + " + " + k + " - index " + arayy[k] + " - value" + " = " + n);

                            Count++;
                        }

                        System.out.println(Count);
                    }

            }

        }
    }

}


