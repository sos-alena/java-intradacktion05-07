package homework.Library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Validation {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static String inputValidateName() throws IOException {
        String str = READER.readLine().trim();
        while (str.isEmpty()) {
            System.out.println("Пусто! Введите значение снова: ");
            str = READER.readLine();
        }
        return str;
    }
    //Моя валидация
    public static int inputValidateYear() {
        try {
            int year = Integer.parseInt(READER.readLine().trim());
            if (year >= 2022) {
                System.out.println("Неверное значение: " + year);
                System.out.println("Введите значение снова: ");
                return inputValidateYear();
            }
            return year;
        } catch (Exception exception) {
            System.out.println("Неверное значение: " + exception.getMessage());
            System.out.println("Введите значение снова: ");
            return inputValidateYear();
        }
    }

    public static int inputValidateNumber() {
        try {
            int number = Integer.parseInt(READER.readLine().trim());
            if (number <= 0) {
                System.out.println("Неверное значение: " + number);
                System.out.println("Введите значение снова: ");
                return inputValidateYear();
            }
            return number;
        } catch (Exception exception) {
            System.out.println("Неверное значение: " + exception.getMessage());
            System.out.println("Введите значение снова: ");
            return inputValidateYear();
        }
    }
}
