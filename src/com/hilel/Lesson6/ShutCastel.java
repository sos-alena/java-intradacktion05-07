package com.hilel.Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShutCastel {

    public static void main(String[] args) throws IOException {

      /*  int start = 1000;
        int end = 1500;
        int distance = 999;
*/
     /*   if (isHit(start, end, distance) || isHit2(start, end, distance)) {
            System.out.println("Yes");
                    } else {
            System.out.println("No");
        }
      */

        System.out.println("Попал? " + isHit(1000, 1200, 1100));

    }

    private static boolean isHit(int start, int end, int distance) {
       if (distance < start || distance > end) {
            return false;
        }else {
            return true;
        }
    }

    private static boolean isHit2(int start, int end, int distance) {
        if (distance >= start && distance <= end) {
            return true;
        }else {
            return false;
        }
    }
}
