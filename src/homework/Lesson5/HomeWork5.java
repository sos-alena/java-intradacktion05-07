package homework.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork5 {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Student scores in five subjects: ");
        System.out.println("Enter scores for higher mathematics:");
        int math = Integer.parseInt(reader.readLine());

        System.out.println("Enter points for Geography:");
        int geograf = Integer.parseInt(reader.readLine());

        System.out.println("Enter scores for English:");
        int english = Integer.parseInt(reader.readLine());

        System.out.println("Enter points for the subject Programming:");
        int program = Integer.parseInt(reader.readLine());

        System.out.println("Enter scores for the subject Management:");
        int management = Integer.parseInt(reader.readLine());


        if (math >= 1 && math <= 12 && geograf >= 1 && geograf <= 12 && english >= 1 && english <= 12 && program >= 1 && program <= 12 && management >= 1 && management <= 12) {
            float avg = ((math + geograf + english + program + management) / 5);
            System.out.println("Average score in five subjects: " + avg);

            Rating(avg);


            System.out.println();
            System.out.println("The entered data is not valid");
        }

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


