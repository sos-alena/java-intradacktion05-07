package homework.lesson14.coffemachina;

import java.io.IOException;
import java.util.ArrayList;

import static homework.lesson14.coffemachina.CoffeMachine.createListDrink;
import static homework.lesson14.coffemachina.CoffeMachine.printCheck;

public class DrinkShop {

    public static void main(String[] args) throws IOException {

        ArrayList<Drink> drinks = createListDrink();

        printCheck(drinks);
    }
}
