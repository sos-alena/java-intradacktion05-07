package homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarsFor {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Let's go wash the car!!! Enter the number of cars to be washed: ");

        int j = Integer.parseInt(READER.readLine());
        for (int i = 1; i <= j; i++) {

            soapCar();
            washCar();
            dryCar();

        }

        System.out.println("Total washed cars: " + j);
    }

    public static void soapCar() {
        System.out.println();
        System.out.println("Stage 1 - soap up the car;");

    }
    public static void washCar() {

        System.out.println("Stage 2 - to wash a car;");
    }

    public static void dryCar() {
        System.out.println("Stage 3 - dry the car;");
        System.out.println();
        System.out.println("The car has been washed and can be returned to the customer.");


    }
}
