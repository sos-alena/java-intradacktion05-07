package homework.lesson11;

import java.io.IOException;

import static homework.lesson11.Password.getNumber;

public class PasswordGeneration {

    public static void main(String[] args) throws IOException {


        System.out.println("Generate number of passwords: ");

        int numb = getNumber(1);

        Password.passwordlist(numb);
    }

}