package homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Palindrome {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        String str2 = getString(); ///Ввели строку с консоли, убрали пробелы, вывели на экран без пробелов
        System.out.println();
        char[] strToArray = str2.toCharArray(); /// вывели строку в массив
        System.out.println("Enter first array: ");
        printArray(strToArray);


        char[] strToArrayTwo = new char[strToArray.length]; /// создали новый массив


        reverseOutput(strToArray, strToArrayTwo); /// заполнили второй массив значениями с первого массива в обратном порядке
        System.out.println();
        System.out.println("Enter second array: ");
        printArray(strToArrayTwo);
        System.out.println();
        System.out.println();

        Boolean result = Arrays.equals(strToArray, strToArrayTwo);
        System.out.println(result);

        comparisonResult(result);

    }

    private static void comparisonResult(Boolean result) {
        if (result) {
            System.out.println("It is palindrome!");
        } else {
            System.out.println("No! It is not palindrome.");
        }
    }

    private static void reverseOutput(char[] strToArray, char[] strToArrayTwo) {
        for (int i = 0; i < strToArrayTwo.length; i++) {

            strToArrayTwo[i] = strToArray[strToArray.length - i - 1];

        }
    }

    public static void printArray(char[] strings) {
        for (char string : strings) {
            System.out.print(string + "  ");
        }
    }

    public static String getString() throws IOException {
        System.out.println("Enter string: ");
        String str = READER.readLine();
        String str2 = str.replaceAll(" ", "");
        System.out.println(str2);
        return str2;
    }

}
