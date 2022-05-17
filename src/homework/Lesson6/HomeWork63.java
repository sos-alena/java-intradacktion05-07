package homework.Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork63 {

    public static void main(String[] args) throws IOException {

        int apple = 59;
        System.out.println(apple);
        int cans = 5;
        System.out.println(cans);
        int cans2 = 3;
        System.out.println(cans2);
        int cans3 = 1;
        System.out.println(cans3);


        result(apple, cans, cans2, cans3);

    }

    public static void result(int apple, int cans, int cans2, int cans3) {

        double z = (apple / cans);
        double m = ((apple % cans) / cans2);
        double s = (m / cans3);
        System.out.println("Big banks " + (int) z);
        System.out.println("Medium banks " + (int) m);
        System.out.println("Small banks " + (int) s);

    }


}
