package com.hilel.Lesson7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CicleDo {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {

        int i = 10;
        do {
            System.out.println(" До взрыва осталось - " + i + "c");
            Thread.sleep(1000);
            i--;
            if (i == 5) {
                break;
            }
            }
            while (i >= 0) ;
        if (i == 0) {
            System.out.println("Boom!!!");
        } else {
            System.out.println("Обезврежена");
        }
        }
    }
