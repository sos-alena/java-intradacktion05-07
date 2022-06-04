package homework.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
public class Password {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    char[] bigLetter = createFillArray(26, (char) 65);
    char[] lowLetter = createFillArray(26, (char) 97);
    char[] number = createFillArray(10, (char) 48);
    char symbol = '_';

    char[] str = newString(bigLetter, lowLetter, number, symbol);
    char[] getPassword = getCod(symbol, number, bigLetter, lowLetter, str);

    public Password() throws IOException {

        System.out.println("Create password");

        shuffleArray(getPassword);

    }
    public char[] createFillArray(int size, char min) throws IOException {
        char[] array = new char[size];
        char minSymbolNamber = min;
        for (int i = 0; i < array.length; i++) {
            array[i] = minSymbolNamber;
            minSymbolNamber++;
        }

        return array;
    }
    public char[] newString(char[] bigLetter, char[] lowLetter, char[] number, char symbol) {
        String str = new String(bigLetter) + new String(lowLetter) + new String(number) + symbol;
        char[] newArray = str.toCharArray();
        return newArray;

    }
    public char[] getCod(char symbol, char[] number, char[] bigLetter, char[] lowLetter, char[] newArray) throws IOException {
        System.out.println("Enter password size (size > 4): ");
        int size = getValue();
            char[] newCod = new char[size];
            int k;
            for (int i = 0; i < 1; i++) {
                k = (int) (Math.random() * bigLetter.length);
                newCod[i] = bigLetter[k];
            }

            int m;
            for (int i = 1; i < 2; i++) {
                m = (int) (Math.random() * lowLetter.length);
                newCod[i] = lowLetter[m];
            }

            int t;
            for (int i = 2; i < 3; i++) {
                t = (int) (Math.random() * number.length);
                newCod[i] = number[t];
            }

            for (int i = 3; i < 4; i++) {
                newCod[i] = symbol;
            }
            int n = 0;
            for (int i = 4; i < newCod.length; i++) {
                n = (int) (Math.random() * newArray.length);
                newCod[i] = newArray[n];
            }

            return newCod;

    }

    static void shuffleArray(char[] newCod) {
        Random rnd = new Random();
        int index;
        for (int i = newCod.length - 1; i > 0; i--) {
            index = rnd.nextInt(i + 1);

            int a = newCod[index];
            newCod[index] = newCod[i];
            newCod[i] = (char) a;
        }

    }

    public static int getValue() throws IOException {
        try {
            int min = 4;
            int number = Integer.parseInt(READER.readLine());
            if (number < 4) {
                System.out.println("Error. Input number is out of range! ");
                System.out.println("Enter a number greater than four");
                return getValue();
            }
            return number;
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            System.out.println("Enter number again");
            return getValue();
        }

    }
    @Override
    public String toString() {
        return "Password{" +
                "Generated password='" + Arrays.toString(getPassword);
    }
}





