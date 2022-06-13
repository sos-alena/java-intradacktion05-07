package homework.algorithmicTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shift {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Enter elements: ");
        String str = READER.readLine();

        System.out.println("enter the number by which you want to shift the array: ");
        int numb = Integer.parseInt(READER.readLine());

        String text = shiftRigth(str, numb);
        String text2 = shiftLeft(str, numb);

    }

    private static String shiftRigth(String str, int numb) {
        String str2 = str.substring(0, str.length() - numb);
        String str3 = str.substring(str.length() - numb);
        String str5 = str3 + str2;
        System.out.println("Right shift: " + str5);

        return str5;
    }

    private static String shiftLeft(String str, int numb) {
        String str2 = str.substring(numb, str.length());
        String str3 = str.substring(0, numb);
        String str5 = str2 + str3;
        System.out.println("Left shift: " +str5);

        return str5;
    }
}