package homework.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HoumLesson5 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter rate langvige: ");
        int number1 = Integer.parseInt(reader.readLine());
        System.out.println("number: " + number1);

        System.out.println("Enter rate langvige: ");
        int number2 = Integer.parseInt(reader.readLine());
        System.out.println("number: " + number2);

    }
}
