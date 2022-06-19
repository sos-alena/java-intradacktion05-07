package homework.lesson14.coffeMachine;

import java.io.IOException;
import java.util.ArrayList;

import static homework.usefulUtilities.getNumber;

public class ChooseDrinkable {

    public static ArrayList<Drinkables> createListDrinkables(Type Type) throws IOException {
        ArrayList<Drinkables> drinks = new ArrayList<>();
        System.out.println("Input number №1 - choose LATTE; " +
                " Input number №2 - choose CAPPUCCINO; " +
                " Input number №3 - choose AMERICANO; " +
                " Input number №4 - choose TEA;"+
                " Input number №5 - process completed");
        Drinkables drink = null;
        int number = getNumber();
        while (!(number == 5)) {
            switch (number) {
                case 1 -> drink = new Latte(Type.LATTE);
                case 2 -> drink = new Cappuccino(Type.CUPPUCCINO);
                case 3 -> drink = new Americano(Type.AMERICANO);
                case 4 -> drink = new Tea(Type.TEA);
            }
            drink.makingDrink();
            drinks.add(drink);
            number = getNumber();
        }
        System.out.println("Process completed!" +
                "Get your check");
        System.out.println("-------------------------------------------");

        return drinks;
    }

    public static void checkPayable(ArrayList<Drinkables> drinkables) {
        int sum = 0;
        for (Drinkables drink : drinkables)
        {
            System.out.println(drink);
            sum += drink.getPrice();
        }
        System.out.println("------------------------------------");
        System.out.println("Amount payable: " + sum + " EUR");
    }
}



