package homework.lesson11;

import java.io.IOException;
public class PasswordGeneration {
    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 10; i++) {
            Password password = new Password();
            System.out.println(password.toString());
        }

    }

}

