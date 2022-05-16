package homework.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork53 {


    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the dimensions of your bag: width, length, height (sm):");
        int w = Integer.parseInt(reader.readLine());

        int l = Integer.parseInt(reader.readLine());

        int h = Integer.parseInt(reader.readLine());

        if (handLagg(w, l, h) || handLagg1(w, l, h)) {
            System.out.println("This is a bag you can take with you on the plane");
        } else {
            System.out.println("No");
        }

    }

    public static boolean handLagg(int w, int l, int h) {
        if (w <= 20 && l <= 40 && h <= 50) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean handLagg1(int w, int l, int h) {
        if (w <= 22 && l <= 53 && h <= 40) {
            return true;
        } else {
            return false;
        }


    }

}