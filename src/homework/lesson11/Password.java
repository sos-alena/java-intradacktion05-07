package homework.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Password {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

   private char[] bigLetter = createFillArray(26, (char) 65);
   private char[] lowLetter = createFillArray(26, (char) 97);
   private char[] number = createFillArray(10, (char) 48);
   private char symbol = '_';

    char[] str = newString(bigLetter, lowLetter, number, symbol);
    char[] getPassword = getCod();

    public Password() throws IOException {

        System.out.println("Create password");

    }
    private char[] createFillArray(int size, char min) throws IOException {
        char[] array = new char[size];
        char minSymbolNamber = min;
        for (int i = 0; i < array.length; i++) {
            array[i] = minSymbolNamber;
            minSymbolNamber++;
        }

        return array;
    }
    private char[] newString(char[] bigLetter, char[] lowLetter, char[] number, char symbol) {
        String str = new String(bigLetter) + new String(lowLetter) + new String(number) + symbol;
        char[] newArray = str.toCharArray();
        return newArray;

    }
    private char[] getCod() throws IOException {
        System.out.println("Enter password size (size > 4): ");
        int size = getNumber(4);

            char[] newCod = new char[size];

        newCod[0] = bigLetter[(char) (Math.random() * bigLetter.length)];
        newCod[1] = lowLetter[(char) (Math.random() * lowLetter.length)];
        newCod[2] = number[(char) (Math.random() * number.length)];
        newCod[3] = symbol;

            char n;
            for (int i = 4; i < newCod.length; i++) {
                n = (char) (Math.random() * str.length);
                newCod[i] = str[n];
            }
            return shuffleArray(newCod);
    }
    private char[] shuffleArray(char[] newCod) {
        char index;
        char a;
        for (int i = 0; i < newCod.length; i++) {
            index = (char) (Math.random() * newCod.length);

            a = newCod[index];
            newCod[index] = newCod[i];
            newCod[i] = a;
        }

        return newCod;
    }

    public static void passwordlist(int numb) throws IOException {
        for (int i = 0; i < numb; i++) {
            Password password = new Password();
            System.out.println(password.toString());
        }
    }
    public static int getNumber(int min) throws IOException {
        try {
            int number = Integer.parseInt(READER.readLine());
            if (number < min){
                System.out.println("Error: " + min);
                System.out.println("Enter number again");
                return getNumber(min);
            }
            return number;
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            System.out.println("Enter number again");
            return getNumber(min);
        }

    }
    @Override
    public String toString() {
        return "Password{" +
                "Generated password='" + Arrays.toString(getPassword);
    }

}





