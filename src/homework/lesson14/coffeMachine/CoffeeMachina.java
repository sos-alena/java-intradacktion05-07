package homework.lesson14.coffeMachine;

import java.io.IOException;
import java.util.ArrayList;

public class CoffeeMachina {
    public static void main(String[] args) throws IOException {

        ArrayList<Drinkables> drinkables = ChooseDrinkable.createListDrinkables();
        ChooseDrinkable.checkPayable(drinkables);
    }
}
