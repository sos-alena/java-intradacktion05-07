package com.hilel.lesson15.humandack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class result {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {


        String input;
        while (!(input=READER.readLine()).equals("stop"))

            switch (input) {
                case "duck" -> {
                    Duck d = new Duck();
                    d.swim();
                    d.fly();
                    d.runn();
                }
                case "human" -> {
                    Human h = new Human();
                    h.swim();
                    h.runn();
                }
                case "ship" -> {
                    Ship s = new Ship();
                    s.swim();
                }
                default -> throw new IllegalArgumentException("Unknown name " + input);
            }
    }
}
