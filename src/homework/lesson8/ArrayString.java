package homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayString {


    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int i = getNumber();
        String[] newStrings = createAndFill(i);
        printArray(newStrings);
        System.out.println();

        String[] oneStrings = getNewStrings(newStrings);

        int min = 0;
        int max = newStrings.length / 2;
        importFromString(newStrings, oneStrings, min, max);

        printArray(oneStrings);

        System.out.println();
        String[] twoStrings = getNewStrings(newStrings);


        int min2 = max;
        int max2 = newStrings.length;
        importFromString(newStrings, twoStrings, min2, max2);

        printArray(twoStrings);
        System.out.println();

    }


    private static String[] getNewStrings(String[] strings) {
        int n = strings.length / 2;
        System.out.println();
        System.out.println("Print anotherString.length: " + n);
        String[] getStrings = new String[n];

        return getStrings;

    }

    private static void importFromString(String[] arrays, String[] anotherArrays, int min, int max) {
        System.out.println("Enter values of oneString: ");

        int i = 0;
        for (int j = min; j < max; j++) {
            anotherArrays[i++] = arrays[j];

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
