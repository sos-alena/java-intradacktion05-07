package homework.lesson14.coffeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ChooseDrinkable {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<Drinkables> createListDrinkables() throws IOException {
        ArrayList<Drinkables> drinks = new ArrayList<>();
        System.out.println("choose LATTE; " +
                " choose CUPPUCCINO; " +
                " choose AMERICANO; " +
                " choose TEA;" +
                " choose STOP - process completed");
        Drinkables drink = null;
        Type typeDrink = Type.valueOf(READER.readLine());
        while (!(typeDrink.equals(Type.STOP))) {
            switch (typeDrink) {
                case LATTE -> drink = new Latte(Type.LATTE);
                case CUPPUCCINO -> drink = new Cappuccino(Type.CUPPUCCINO);
                case AMERICANO -> drink = new Americano(Type.AMERICANO);
                case TEA -> drink = new Tea(Type.TEA);
            }
            drink.makingDrink();
            drinks.add(drink);
            typeDrink = Type.valueOf(READER.readLine());
        }
        System.out.println("Process completed!"+
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



