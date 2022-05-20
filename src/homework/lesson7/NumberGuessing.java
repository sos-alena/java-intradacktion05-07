package homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGuessing {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("The computer guessed a number from min to max (enter the values into the console): ");

        int min = Integer.parseInt(READER.readLine());
        int max = Integer.parseInt(READER.readLine());

        int number = generateRandom(min, max);

        System.out.println("Enter your number from " + min + " to " + max);
        int number2 = Integer.parseInt(READER.readLine());
        while (number2 != number) {

            if (valid(number2, min, max)) {
                System.out.println("User name - " + number2 + " Wrong!");

            } else {
                System.out.println("Error. Enter your number from " + min + " to " + max);
            }
            number2 = Integer.parseInt(READER.readLine());

        }
        System.out.println("You are winner!!! " + number2 + " = " + number);

    }

    public static int generateRandom(int min, int max) {

        return (int) (Math.random() * (max - min) + min);
    }


    public static boolean valid(int number, int min, int max) {
        return (number >= min && number <= max);
    }


}

