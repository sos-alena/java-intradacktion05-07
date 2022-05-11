package homework.Lesson4;

import java.util.Scanner;

public class HoumLesson41 {

    public static void main(String[] args) {

        Scanner pets = new Scanner(System.in);

        System.out.println("Input number of dogs: ");
        int dogs = pets.nextInt();
        System.out.println("Input number of cats: ");
        int cats = pets.nextInt();

        float food = 50;
        int times = 3;
        float price = 2;


        int foodDog = foodPets(dogs, food, times);
        System.out.println("Need food for dogs per month (3 times a day, 50 gm): " + foodDog + "gm;");

        int foodCat = foodPets(cats, food, times);
        System.out.println("Need food for cats per month (3 times a day, 50 gm): " + foodCat + "gm;");

        float T = total(foodDog, foodCat, food, price);
        System.out.println("Need money per month to maintain the shelter (price 2$ for 50 gm): " + T + "$;");

    }

    public static int foodPets(int pets, float food, int times) {
                return (int) (pets * food * times);
    }

    public static float total(int foodDog, int foodCat, float food, float price) {
        return (float) ((foodDog + foodCat) * price / food);


    }
}
