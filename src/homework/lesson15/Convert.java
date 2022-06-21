package homework.lesson15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static homework.usefulUtilities.getNumber;

public class Convert {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Degrees c = new Celsius();

        System.out.println("Input degrees Celsius: ");
        int degree = getNumber();
        System.out.println("Input FAHRENHEIT or KELVINS: ");
        String type = String.valueOf(input());

        c.convert(degree, type);
    }

    public static Type input() throws IOException {
        try {
            return Type.valueOf(READER.readLine());

        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            System.out.println("Enter value again");
            return input();
        }
    }
}

