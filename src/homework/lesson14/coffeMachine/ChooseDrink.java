package homework.lesson14.coffeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ChooseDrink {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<Drink> createListDrinkables() throws IOException {
        ArrayList<Drink> drinks = new ArrayList<>();
        System.out.println("choose LATTE; " +
                " choose CUPPUCCINO; " +
                " choose AMERICANO; " +
                " choose TEA;" +
                " choose STOP - process completed");
        Drink drink = null;
        Type typeDrink = Type.valueOf(READER.readLine());
        while (!typeDrink.equals(Type.STOP)) {
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
        return drinks;
    }

    public static void checkPayable(ArrayList<Drink> drinks) {
        int sum = 0;
        for (Drink drink : drinks) {
            System.out.println(drink);
            sum += drink.getPrice();
        }
        System.out.println("------------------------------------");
        System.out.println("Amount payable: " + sum + " EUR");
    }
}



