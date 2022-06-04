package homework.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static homework.lesson11.Password.getNumber;

public class PasswordGeneration {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        System.out.println("Generate number of passwords: ");

        int numb = getNumber();

        for (int i = 0; i < numb; i++) {
            Password password = new Password();
            System.out.println(password.toString());





        }
    }

}
