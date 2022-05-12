package homework.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork52 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the dimensions of your bag: width, length, height (sm):");
        int number = Integer.parseInt(reader.readLine());
        Integer w = Integer.parseInt(String.valueOf(number));

        int number2 = Integer.parseInt(reader.readLine());
        Integer l = Integer.parseInt(String.valueOf(number2));

        int number3 = Integer.parseInt(reader.readLine());
        Integer h = Integer.parseInt(String.valueOf(number3));


        handLagg(w, l, h);


    }

    private static void handLagg(Integer w, Integer l, Integer h) {
        if (w <= 20 && l <= 55 && h <= 40) {
            System.out.println("This is a bag you can take with you on the plane.");
        } else if (w <= 22 && l <= 40 && h <= 53) {
            System.out.println("This is a suitcase you can take with you on the plane.");
        }
        else {
            System.out.println("Your bags must be checked in");

        }
    }


}
