package homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arrayString {


    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int i = getNumber();
        String[] newStrings = createAndFill(i);
        printArray(newStrings);
        System.out.println();

        String[] oneStrings = getNewStrings(newStrings);

        importFromStringOne(newStrings, oneStrings);

        printArray(oneStrings);

        System.out.println();
        String[] twoStrings = getNewStrings(newStrings);

        importFromStringTwo(newStrings, twoStrings);

        printArray(twoStrings);
        System.out.println();

    }


    private static String[] getNewStrings(String[] strings) {
        int n = strings.length / 2;
        System.out.println();
        System.out.println("Print anotherString.length: " + n);
        String[] getStrings = new String[n];
        {

            return getStrings;
        }

    }

    private static void importFromStringOne(String[] arrays, String[] anotherArrays) {
        System.out.println("Enter values of oneString: ");
        for (int j = 0; j < anotherArrays.length; j++) {
            anotherArrays[j] = arrays[j];

        }
    }

    public static void importFromStringTwo(String[] arrays, String[] anotherArrays) {
        System.out.println("Enter values of twoString: ");
        for (int j = 0; j < anotherArrays.length; j++) {
            anotherArrays[j] = arrays[arrays.length / 2 + j];
        }
    }

    public static void printArray(String[] strings) {
        for (String string : strings) {
            System.out.print(string + "  ");
        }
    }

    public static void fillArray(String[] strings) throws IOException {
        System.out.println("print the string values: ");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = READER.readLine();

        }

    }

    public static String[] createAndFill(int size) throws IOException {
        String[] strings = new String[size];
        fillArray(strings);
        return strings;
    }

    private static Integer getNumber() {
        try {
            System.out.println("Enter size");
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            System.out.println("Enter number again");
            return getNumber();
        }
    }

}
