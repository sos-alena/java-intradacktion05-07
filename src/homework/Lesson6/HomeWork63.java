package homework.Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork63 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of apples harvested");
        int apple = Integer.parseInt(reader.readLine());
        int cans = Integer.parseInt(reader.readLine());
        int cans2 = Integer.parseInt(reader.readLine());
        int cans3 = Integer.parseInt(reader.readLine());



        double z = harvest2(apple, cans);
        double x = harvest(apple, cans);
        double m = harvest2((int) x, cans2);
        double d = harvest((int) x, cans2);
        double s = harvest2((int) d, cans3);
        double w = harvest((int) d, cans3);


        System.out.println("Big banks " + (int) z);
        System.out.println("Medium banks " + (int) m);
        System.out.println("Small banks " + (int) s);


    }

    private static double harvest(int a, int c) {
        return (double) (a % c);

    }

    private static double harvest2(int a, int c) {
        return (double) (a / c);

    }


}
