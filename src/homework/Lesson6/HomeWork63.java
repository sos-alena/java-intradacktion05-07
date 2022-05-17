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


        result(apple, cans, cans2, cans);

    }

    public static void result(int apple, int cans, int cans2, int cans3) {

        double z = (apple / cans);
        double m = ((apple % cans) / cans2);
        double s = (((apple % cans) / cans2) / cans3);
        System.out.println("Big banks " + (int) z);
        System.out.println("Medium banks " + (int) m);
        System.out.println("Small banks " + (int) s);

    }


}
