package homework.lesson7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class japanNumbers {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {

            if (i % 10 - 4 != 0 && i % 10 - 9 != 0)
                System.out.println("i = " + (i));
        }

    }
}
