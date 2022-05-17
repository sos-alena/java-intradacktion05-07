package homework.Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numb1 = Integer.parseInt(reader.readLine());

        String operation = reader.readLine();

        int numb2 = Integer.parseInt(reader.readLine());


        double result = calc(numb1, operation, numb2);
        System.out.println(numb1 + operation + numb2 + "=" + result);

    }

    private static double calc(int numb1, String operation, int numb2) {
        switch (operation) {
            case "+":
                return (double) (numb1 + numb2);
            case "-":
                return (double) (numb1 - numb2);
            case "*":
                return (double) (numb1 * numb2);
            case "/":
                return (double) (numb1 / numb2);
            default:
                System.out.println("Error");
                break;
        }
        return 0;
    }



}




