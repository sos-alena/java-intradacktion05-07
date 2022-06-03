package homework.lesson11;

import java.io.IOException;

import static homework.lesson11.Password.createFillArray;

public class PasswordGeneration {


    public static void main(String[] args) throws IOException {


        char[] bigLetter = createFillArray(26, (char) 65);

        char[] lowLetter = createFillArray(26, (char) 97);

        char[] number = createFillArray(10, (char) 48);

        char symbol = '_';

        Password password = new Password(bigLetter, lowLetter, number, symbol);

        char[] ArrayPassword = new char[5];

        for (char pass:ArrayPassword)
             {
                 Password password2 = new Password(bigLetter, lowLetter, number, symbol);
        }

    }

}

