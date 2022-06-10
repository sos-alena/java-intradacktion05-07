package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class usefulUtilities {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static int getNumber() throws IOException {
        try {
            int number = Integer.parseInt(READER.readLine());
            if (number < 1) {
                System.out.println("Error. Input number is out of range! ");
                System.out.println("Enter a number greater than four");
                return getNumber();
            }
            return number;
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            System.out.println("Enter number again");
            return getNumber();
        }
    }

    public static int getNumber(int min) throws IOException {
        try {
            int number = Integer.parseInt(READER.readLine());
            if (number < min) {
                System.out.println("Error. Input number is out of range! ");
                System.out.println("Enter a number greater than four");
                return getNumber();
            }
            return number;
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            System.out.println("Enter number again");
            return getNumber();
        }
    }
}
