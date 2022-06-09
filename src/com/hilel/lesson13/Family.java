package com.hilel.lesson13;

import java.io.IOException;

public class Family {
    public static void main(String[] args) throws IOException {

        System.out.println("Create a list of person. Input number: ");
        int number = Human.getNumber();

        Human[] humans = Human.createlistOfPeople(number);

    }
}
