package homework.Lesson5;

import java.util.Scanner;

public class HomeWork51 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Student scores in five subjects: ");
        System.out.println("Enter scores for higher mathematics:");
        int m = scanner.nextInt();

        System.out.println("Enter points for Geography:");
        int g = scanner.nextInt();

        System.out.println("Enter points for the subject Programming:");
        int p = scanner.nextInt();

        System.out.println("Enter scores for the subject Management:");
        int n = scanner.nextInt();

        System.out.println("Enter scores for English:");
        int e = scanner.nextInt();

        System.out.println();
        float avg = averageRating(m, g, p, n, e);
        System.out.println("Average score in five subjects: " + avg);

        if (avg >= 10 && avg <= 12) {
            System.out.println("Student receives a scholarship!");
        } else if (avg >= 8 && avg < 10) {
            System.out.println("Student receives regular scholarship!");

        } else if (avg > 0 && avg < 8) {
            System.out.println("Student does not receive a scholarship");
        } else {
            System.out.println("Incorrectly entered data for calculating the average score.");
        }
    }

    public static float averageRating(int m, int g, int p, int n, int e) {
        return (float) ((m + g + p + n + e) / 5);
    }
}
