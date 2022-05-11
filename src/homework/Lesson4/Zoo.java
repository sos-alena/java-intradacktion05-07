package homework.Lesson4;

import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {

        Scanner zoo = new Scanner(System.in);

        System.out.println("Input number bear: ");
        int b = zoo.nextInt();
        System.out.println("Input number zebra: ");
        int z = zoo.nextInt();
        System.out.println("Input number elefant: ");
        int e = zoo.nextInt();
        System.out.println("Input number giraf: ");
        int g = zoo.nextInt();
        System.out.println("Input number dicoobraz: ");
        int d = zoo.nextInt();

        int Total = calculateAnimals(b, z, e, g, d);
        System.out.println("Animals at the moment -" + Total);

        double Total2 = calculateAnimalsNextYear(b, z, e, g, d, Total);
        int x = (int) Total2;
        System.out.println("Animals next year -" + x);


    }

    public static int calculateAnimals(int animals1, int animals2, int animals3, int animals4, int animals5) {
        return (int) (animals1 + animals2 + animals3 + animals4 + animals5);

    }

    public static double calculateAnimalsNextYear(int animals1, int animals2, int animals3, int animals4, int animals5, int Total) {
        return (double) (Total + ((animals1 * 0.3) + (animals2 * 0.1) + (animals3 * 0.15) + (animals4 * 0.5) + (animals5 * 0.16)));
    }

}
