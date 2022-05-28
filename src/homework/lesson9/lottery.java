package homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class lottery {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Enter length: ");
        int length = getNumber();
        System.out.print("The company that organizes the lottery made a number of " + length + " numbers.");

        System.out.println();
        int[] numbers = createAndFillArrayRandom(length);
        System.out.println();
        int[] numbers2 = createAndFillArrayReader(length);
        System.out.println();

        Arrays.sort(numbers);
        Arrays.sort(numbers2);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

        coincidences(numbers, numbers2);

        }
    public static void coincidences(int[] numbers, int[] numbers2) {
        int x = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == (numbers2[i])) {
                x++;
                System.out.println("Index: " + i + "; coincidences: " + numbers[i]);
            }

        }
        System.out.println();
        System.out.println("Number of coincidences total: " + x);
    }

    public static int[] createAndFillArrayReader(int size) throws IOException {

        int[] numbers = new int[size];
        System.out.println("Enter min: ");
        int min = getNumber();
        System.out.println("Enter max: ");
        int max = getNumber();
        System.out.println("Enter the numbers that the player guesses from " + min + " to " + max + ": ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = getNumber(min, max);
        }
        return numbers;
    }

    public static int[] createAndFillArrayRandom(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);

        }
        return numbers;
    }
    public static Integer getNumber() {
        try {
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            System.out.println("Enter number again");
            return getNumber();
        }
    }
    public static int getNumber(int min, int max) throws IOException {
        try {
            int number = Integer.parseInt(READER.readLine());
            if (number < min || number > max) {
                System.out.println("Error. Input number is out of range! ");
                System.out.println("Enter number again");
                return getNumber(min, max);
            }
            return number;
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            System.out.println("Enter number again");
            return getNumber(min, max);
        }

    }


}