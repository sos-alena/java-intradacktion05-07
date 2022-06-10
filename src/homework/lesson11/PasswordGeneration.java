package homework.lesson11;

import homework.usefulUtilities;

import java.io.IOException;


public class PasswordGeneration {

    public static void main(String[] args) throws IOException {

        System.out.println("Generate passwords in quantity: ");
        Password[] password = Password.createListPasswords(usefulUtilities.getNumber());

        }

    }
