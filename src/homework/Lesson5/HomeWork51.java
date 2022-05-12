package homework.Lesson5;

import java.util.Scanner;

public class HomeWork51 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Student scores in five subjects: ");
        System.out.println("Enter scores for higher mathematics:");
        int Mathematics = scanner.nextInt();

        System.out.println("Enter points for Geography:");
        int Geography = scanner.nextInt();

        System.out.println("Enter points for the subject Programming:");
        int Programming = scanner.nextInt();

        System.out.println("Enter scores for the subject Management:");
        int Management = scanner.nextInt();

        System.out.println("Enter scores for English:");
        int English = scanner.nextInt();

        System.out.println();
        if (Mathematics >= 1 && Mathematics <= 12 && Geography >= 1 && Geography <= 12 && Programming >= 1 && Programming <= 12 && Management >= 1 && Management <= 12 && English >= 1 && English <= 12) {
            float avg = ((Mathematics + Geography + Programming + Management + English) / 5);
            System.out.println("Average score in five subjects: " + avg);
            if (avg >= 10 && avg <= 12) {
                System.out.println("Student receives a scholarship!");
            } else if (avg >= 8 && avg < 10) {
                System.out.println("Student receives regular scholarship!");

            } else if (avg > 0 && avg < 8) {
                System.out.println("Student does not receive a scholarship");
            }
        } else {
            System.out.println("Incorrectly entered data for calculating the average score.");
        }


    }

}


