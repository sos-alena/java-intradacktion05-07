package homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortVariables {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int length = InputSize();
        int[] numbers = new int[length];

        FillArray(numbers);

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

    }
    public static void FillArray(int[] numbers) {
        System.out.println("Enter the number of the array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = getNumber();

        }
    }
    public static int InputSize() throws IOException {
        System.out.println("Enter the length: ");
        return getNumber();
    }
    private static Integer getNumber() {

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


