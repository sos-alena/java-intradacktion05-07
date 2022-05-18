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

        int result = cansBig(apple, cans);
        System.out.println("Big banks for 5 apples - " + result + " banks;");

        int result2 = cansMidle(apple, cans, cans2);
        System.out.println("Medium banks for 3 apples - " + result2 + " banks;");

        int result3 = cansSmall(apple, cans, cans2, cans3);
        System.out.println("Small banks for 1 apple - " + result3 + " banks;");


    }

    public static int cansBig(int apple, int cans) {
        return (apple / cans);
    }

    public static int cansMidle(int apple, int cans, int cans2) {
        return (apple % cans / cans2);
    }

    public static int cansSmall(int apple, int cans, int cans2, int cans3) {
        return (apple % cans % cans2 / cans3);

    }

}