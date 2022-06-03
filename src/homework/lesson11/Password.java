package homework.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;


public class Password {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    char[] bigLetter;
    char[] lowLetter;
    char[] number;
    char symbol;
    public Password(char[] bigLetter, char[] lowLetter, char[] number, char symbol) throws IOException {

        System.out.println("Create new password!");

        char[] str = newString(bigLetter, lowLetter, number, symbol);

        char[] getPassword = getCod(symbol, number, bigLetter, lowLetter, str);

        shuffleArray(getPassword);

        System.out.println(Arrays.toString(getPassword));

    }

    public static char[] createFillArray(int size, char min) throws IOException {
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
            char[]newArray = str.toCharArray();
            return newArray;

    }
    public char[] getCod(char symbol, char[] number, char[] bigLetter, char[] lowLetter, char[]newArray) throws IOException {
        System.out.println("Enter size: ");
        int size = getNumber();
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

    public static int getNumber() {
        try {
            String str = READER.readLine();
            return (char) Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            System.out.println("Enter number again");
            return getNumber();
        }
    }

    @Override
    public String toString() {
        return "Password{" +
                "bigLetter=" + Arrays.toString(bigLetter) +
                ", lowLetter=" + Arrays.toString(lowLetter) +
                ", number=" + Arrays.toString(number) +
                ", symbol=" + symbol +
                '}';
    }
}


