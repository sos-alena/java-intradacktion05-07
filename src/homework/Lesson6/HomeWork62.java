package homework.Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork62 {


    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numb1 = Integer.parseInt(reader.readLine());

        String operation = reader.readLine();

        int numb2 = Integer.parseInt(reader.readLine());


        int x = calc(numb1, operation, numb2);
        System.out.println(numb1 + operation + numb2 + "=" + x);

    }

    private static int calc(int numb1, String operation, int numb2) {
        int result = 0;
        if ("+".equals(operation)) {
            result = numb1 + numb2;
        } else if
        ("-".equals(operation)) {
            result = numb1 - numb2;
        } else if ("*".equals(operation)) {
            result = numb1 * numb2;
        } else if ("/".equals(operation)) {
            result = numb1 / numb2;
        } else {
            System.out.println("Error");
        }
        return result;
    }


}

