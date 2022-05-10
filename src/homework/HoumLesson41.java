package homework;

import java.util.Scanner;

public class HoumLesson41 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number of dogs: ");
        int dogs = scanner.nextInt();
        System.out.println("Input number of cats: ");
        int cats = scanner.nextInt();

        float food = 50;
        int times = 3;
        float priсe = 2;


        int foodDog = foodDog(dogs, food, times);
        System.out.println("Need food for dogs per month (3 times a day, 50 gm): " + foodDog + "gm;");

        int foodCat = foodCat(cats, food, times);
        System.out.println("Need food for cats per month (3 times a day, 50 gm): " + foodCat + "gm;");

        float T = total(foodDog, foodCat, food, priсe);
        System.out.println("Need money per month to maintain the shelter (price 2$ for 50 gm): " + T + "$;");

    }

    public static int foodDog(int dogs, float food, int times) {
        return (int) (dogs * food * times);
    }

    public static int foodCat(int cats, float food, int times) {
        return (int) (cats * food * times);
    }

        public static float total(int foodDog,int foodCat, float food, float price){
            return (float) ((foodDog + foodCat) * price / food);


    }
}
