package homework.lesson10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        System.out.println("Enter number: ");
        int number = getNumber();

        int fact = factorial(number);
        System.out.println("Factorial number " + number + " - " + fact);

    }
   public static int factorial(int n)
    {
        if (n == 1) return 1;

        return n * factorial(n - 1);
    }

    public static Integer getNumber() {
        try {
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            System.out.println("Enter number again");
            return getNumber();
        }
    }
}
