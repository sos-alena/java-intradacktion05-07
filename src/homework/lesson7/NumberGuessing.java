package homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGuessing {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        int number = generateRandom();
        System.out.println("The computer guessed a number from 1 to 10: ");

        System.out.println("Enter your number from 1 to 10:");
        int number2 = Integer.parseInt(READER.readLine());
        while (number2 != number) {

            if (valid(number2)) {
                System.out.println("User name - " + number2 + " Wrong!");

            } else {
                System.out.println("Error. Enter your number from 1 to 10:");
            }
            number2 = Integer.parseInt(READER.readLine());

        }
        System.out.println("You are winner!!! " + number2 + " = " + number);

    }

    public static int generateRandom() {
        return (int) (Math.random() * 10);
    }


    public static boolean valid(int number) {
        return (number >= 0 && number <= 10);
    }


}

