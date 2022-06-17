package homework.lesson14.coffeMachine;

public class Americano extends Drinkables {

    private static final int PRICECOFFEE = 40; // стоимость кофе за 100 гр
    private static final int PORTIONCOFFEE = 22; // необходимая порция для приготовления 1 чашки еспрессо

    public Americano(Type typeDrinkables) {
        super(typeDrinkables);
    }

    @Override
    public void makingDrink() {
        super.makingDrink();
        System.out.println("Preparing Espresso coffee 22 gm;");
        System.out.println("Adding water 1/3;");
        System.out.println("Pick up your Americano!");
        System.out.println("----------------------------------------------");
    }
    @Override
    public int calculatePrice() {
        this.price = PRICECOFFEE * PORTIONCOFFEE / 100;
        return super.calculatePrice();
    }
}
