package homework.lesson14.coffeMachine;

import java.io.IOException;
import java.util.ArrayList;

import static homework.usefulUtilities.getNumber;

public class CoffeeMachina {

    public static void main(String[] args) throws IOException {

        ArrayList<Drinkables> drinkables = CreateListDrinkables();
        CheckPayable(drinkables);
    }
    private static ArrayList<Drinkables> CreateListDrinkables() throws IOException {
        ArrayList<Drinkables> drinkables = new ArrayList<>();
        System.out.println("Input number №1 - choose LATTE; " +
                " Input number №2 - choose CAPPUCCINO; " +
                " Input number №3 - choose AMERICANO; " +
                " Input number №4 - choose TEA;"+
                " Input number №5 - process completed");
        int number = getNumber();
        while (!(number == 5)) {
            switch (number) {
                case 1:
                    drinkables.add(new Latte(Type.LATTE));
                    break;
                case 2:
                    drinkables.add(new Cappuccino(Type.CUPPUCCINO));
                    break;
                case 3:
                    drinkables.add(new Americano(Type.AMERICANO));
                    break;
                case 4:
                    drinkables.add(new Tea(Type.TEA));
                    break;
            }
            number = getNumber();
            if (number == 5) {
                System.out.println("Process completed!"+
                        "Get your check");
                System.out.println("-------------------------------------------");
            }
        }
        return drinkables;
    }
    private static void CheckPayable(ArrayList<Drinkables> drinkables) {
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
