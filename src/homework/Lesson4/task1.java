package homework.Lesson4;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input message1: ");
        String a = scanner.nextLine();
        System.out.println("Input message2: ");
        String b = scanner.nextLine();
        System.out.println("Input number: ");
        int c = scanner.nextInt();

        message(a, b, c);


    }

    public static void message(String message1, String message2, int number) {
        System.out.println(message1 + message2 + number);

    }
}
