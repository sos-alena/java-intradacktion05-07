package homework.lesson15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static homework.usefulUtilities.getNumber;

public class Convert {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        do {
            System.out.println("Input degrees Celsius");
            int temp = getNumber();
            System.out.println("Input FAHRENHEIT or KELVINS");
            Type type = inputType();

            Converterable convert = createConvert(type);
            convert.convert(temp);

            System.out.println("-----------------------------------");
            System.out.println("Press ENTER to start or input 'stop' to end.stop");
        }
        while (!READER.readLine().equalsIgnoreCase("stop"));
    }

    public static Converterable createConvert(Type type) {
        return switch (type) {
            case KELVINS -> new Kelvins();
            case FAHRENHEIT -> new Fahrenheit();
        };
    }

    public static Type inputType() {
        try {
            return Type.valueOf(READER.readLine());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error value again");
            return inputType();
        }
    }
}