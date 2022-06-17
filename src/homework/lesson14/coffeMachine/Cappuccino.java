package homework.lesson14.coffeMachine;
public class Cappuccino extends Drinkables{
    private static final int COFFEE = 40; // стоимость кофе за 100 гр
    private static final int PORTIONCOFFEE = 22; // необходимая порция для приготовления 1 чашки еспрессо
    private static final int MILK = 5; // стоимость молока за 100 гр
    private static final int PORTIONMILK = 8; // необходимая порция для приготовления 1 чашки латте

    public Cappuccino(Type typeDrinkables) {
        super(typeDrinkables);
    }
    @Override
    public void makingDrink() {
        super.makingDrink();
        System.out.println("Preparing Espresso coffee 22 gm;");
        System.out.println("Adding milk 8 gm;");
        System.out.println("Adding milk foam;");
        System.out.println("Pick up your Cappuccino!");
        System.out.println("--------------------------------------------");
    }
    @Override
    public int calculatePrice() {
        this.price = ((COFFEE * PORTIONCOFFEE)  + (MILK * PORTIONMILK)) / 100;
        return super.calculatePrice();
    }
}
