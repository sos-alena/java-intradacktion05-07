package homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class lottery {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Enter length: ");
        int length = Integer.parseInt(READER.readLine());
        int[] numbers = new int[length];
        int[] numbers2 = new int[length];

        FillRandom(numbers);
        System.out.println();
        FillReader(numbers2);

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
    public static void FillReader(int[] numbers) throws IOException {
        System.out.println("Enter the numbers that the player guesses from 0 to 9: ");

        for (int i = 0; i < numbers.length; i++) {
            int input = getNumber();
            if (input >= 0 && input <= 9) {
                numbers[i] = input;
            } else {
                System.out.println("Error: " + input);
                System.out.println("Enter number again from 0 to 9");
                numbers[i] = getNumber();
            }
        }

    }

    public static void FillRandom(int[] numbers) {
        System.out.print("The company that organizes the lottery made a number of " + numbers.length + " numbers.");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);

        }
    }
    private static Integer getNumber() {

        try {
            String str = READER.readLine();
            return Integer.parseInt(str);

        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            System.out.println("Enter number again from 0 to 9");
            return getNumber();
        }
    }
}