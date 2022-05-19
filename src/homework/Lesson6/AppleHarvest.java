package homework.Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppleHarvest {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Harvest of apples ");
        int apple = Integer.parseInt(reader.readLine());

        int cans = 5;
        System.out.println("Big banks - " + cans + " apples;");
        int cans2 = 3;
        System.out.println("Midle banks - " + cans2 + " apples;");
        int cans3 = 1;
        System.out.println("Small banks - " + cans3 + " apples;");

        System.out.println();

        int result = cans(apple, cans);
        System.out.println("Big banks for 5 apples - " + result + " banks;");

        int result2 = cans2(apple, cans);
        int result22 = cans(result2, cans2);
        System.out.println("Medium banks for 3 apples - " + result22 + " banks;");

        int result3 = cans2(result2, cans2);
        int result33 = cans(result3, cans3);
        System.out.println("Small banks for 1 apple - " + result33 + " banks;");


    }

    public static int cans(int apple, int cans) {
        return (apple / cans);
    }

    public static int cans2(int apple, int cans) {
        return (apple % cans);
    }



}