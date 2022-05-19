package homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarsFor {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, InterruptedException {

        String input = "Let's go wash the car!!!";
        int sum = 0;
        for (int i = 1; i <= 5; i++) {

            stage1();
            stage2();
            stage3();

            System.out.println();
            System.out.println("The car has been washed and can be returned to the customer.");
            System.out.println();
            System.out.println("Number of cars washed. №" + i);
            System.out.println();
            sum++;
        }

        System.out.println("Total washed cars: " + sum);
    }

    public static void stage1() {

        System.out.println("Stage 1 - soap up the car;");

    }

    public static void stage2() {

        System.out.println("Stage 2 - to wash a car;");
    }

    public static void stage3() {

        System.out.println("Stage 3 - dry the car;");

    }
}
