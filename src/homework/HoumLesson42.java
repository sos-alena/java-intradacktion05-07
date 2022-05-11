package homework;

import java.util.Scanner;

public class HoumLesson42 {

    public static void main(String[] args) {

        Scanner petrolExpense = new Scanner(System.in);

        System.out.println("Input distance, km: ");
        float distance = petrolExpense.nextInt();
        System.out.println("Input Expense of petrol total, l: ");
        float petrol = petrolExpense.nextInt();

        double E = expense(distance, petrol);
        System.out.println("Expense of petrol 100 km:" + E + "l");

    }

    public static double expense(float distance, float petrol) {
        return (double) (petrol / distance * 100);

    }
}