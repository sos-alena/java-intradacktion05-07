package homework.library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Validation {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static String inputValidateStr() throws IOException {
        String str = READER.readLine().trim();
        while (str.isEmpty()) {
            System.out.println("Пусто! Введите значение снова: ");
            str = READER.readLine();
        }
        return str;
    }
    public static int inputValidateNumber(int min, int max) {
        try {
            int number = Integer.parseInt(READER.readLine().trim());
            if (number <= min || number > max) {
                System.out.println("Неверное значение: " + number);
                System.out.println("Введите значение снова: ");
                return inputValidateNumber(min, max);
            }
            return number;
        } catch (Exception exception) {
            System.out.println("Неверное значение: " + exception.getMessage());
            System.out.println("Введите значение снова: ");
            return inputValidateNumber(min, max);
        }
    }
}
