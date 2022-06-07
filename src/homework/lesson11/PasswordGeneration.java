package homework.lesson11;

import java.io.IOException;


public class PasswordGeneration {

    public static void main(String[] args) throws IOException {

        System.out.println("Generate passwords in quantity: ");
        Password[] password = Password.createListPasswords(Password.getNumber(0));

        }

    }
