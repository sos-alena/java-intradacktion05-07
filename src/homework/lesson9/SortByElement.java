package homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortByElement {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the length: ");
        int length = getNumber();
        System.out.println("Enter the search number: ");
        int search = getNumber();

        int[] numbers = createAndFillArray(length);

        System.out.println(Arrays.toString(numbers));

        sortByElement(numbers, search);

        System.out.println(Arrays.toString(numbers));

    }
    public static void sortByElement(int[] numbers, int search) throws IOException {
        int count = 0;
        for (int j = 1; j < numbers.length; j++) {
            for (int i = 0; i < j - 1; i++) {
                if (numbers[i] != search) {
                    count = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = count;

                } else {
                    numbers[i] = search;
                }
            }
        }
    }
    public static int[] createAndFillArray(int size) {
        int[] numbers = new int[size];
        System.out.println("Enter the number of the array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = getNumber();

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
}





