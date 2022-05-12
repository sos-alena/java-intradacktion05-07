package homework.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork5 {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Student scores in five subjects: ");
        System.out.println("Enter scores for higher mathematics:");
        int number = Integer.parseInt(reader.readLine());
        Integer i = Integer.parseInt(String.valueOf(number));

        System.out.println("Enter points for Geography:");
        int number1 = Integer.parseInt(reader.readLine());
        Integer a = Integer.parseInt(String.valueOf(number1));

        System.out.println("Enter scores for English:");
        int number2 = Integer.parseInt(reader.readLine());
        Integer e = Integer.parseInt(String.valueOf(number2));

        System.out.println("Enter points for the subject Programming:");
        int number3 = Integer.parseInt(reader.readLine());
        Integer p = Integer.parseInt(String.valueOf(number3));

        System.out.println("Enter scores for the subject Management:");
        int number4 = Integer.parseInt(reader.readLine());
        Integer m = Integer.parseInt(String.valueOf(number4));

        System.out.println();
        float avg = averageRating(i, a, e, p, m);
        System.out.println("Average score in five subjects: " + avg);

        Rating(avg);

    }

    public static float averageRating(int i, int a, int e, int p, int m) {
        return (float) ((i + a + e + p + m) / 5);

    }

    public static void Rating(float avg) {
        switch ((int) avg) {
            case 10:
            case 11:
            case 12:
                System.out.println("Student receives a scholarship!");
                break;
            case 8:
            case 9:
                System.out.println("Student receives regular scholarship!");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:

                System.out.println("Student does not receive a scholarship!");
                break;
            default:
                System.out.println("Incorrectly entered data for calculating the average score ");
                break;
        }

    }

}

