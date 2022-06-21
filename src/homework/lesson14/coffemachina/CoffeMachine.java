package homework.lesson14.coffemachina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CoffeMachine {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private static Drink choosDrink(Type typeDrink) throws IOException {

        return switch (typeDrink) {
            case LATTE -> new Latte(Type.LATTE);
            case CUPPUCCINO -> new Cappuccino(Type.CUPPUCCINO);
            case AMERICANO -> new Americano(Type.AMERICANO);
            case TEA -> new Tea(Type.TEA);
        };
    }
    public static ArrayList<Drink> createListDrink() throws IOException {
        ArrayList<Drink> drinks = new ArrayList<>();
        System.out.println("choose LATTE; " +
                " choose CUPPUCCINO; " +
                " choose AMERICANO; " +
                " choose TEA;" +
                " choose STOP - process completed");
        String str;
        while (!(str = input()).equals("STOP")) {
            Type typeDrink = Type.valueOf(str);
            Drink drink = choosDrink(typeDrink);
            drinks.add(drink);
            drink.makingDrink();
        }        System.out.println("Process completed. Get your check!");
        System.out.println("___________________________________");
        return drinks;
    }

    public static void printCheck(ArrayList<Drink> drinks) {
        int sum = 0;
        for (Drink drink : drinks) {
            System.out.println(drink);
            sum += drink.getPrice();
        }
        System.out.println("------------------------------------");
        System.out.println("Amount payable: " + sum + " EUR");
    }

    public static String input() throws IOException {
        String str;
        if (((str=READER.readLine()).equals("LATTE")) ||
                (str.equals("CUPPUCCINO")) ||
                (str.equals("AMERICANO")) ||
                (str.equals("TEA")) ||
                (str.equals("STOP"))) {
            return str;
        }
        System.out.println("Error: ");
        System.out.println("Enter value again");
        return input();
    }
}
