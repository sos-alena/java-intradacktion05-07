package homework.lesson14.coffemachina;
public class Cappuccino extends Drink{
    private static final int COFFEE = 40; // стоимость кофе за 100 гр
    private static final int PORTION_COFFEE = 22; // необходимая порция для приготовления 1 чашки еспрессо
    private static final int MILK = 5; // стоимость молока за 100 гр
    private static final int PORTION_MILK = 8; // необходимая порция для приготовления 1 чашки латте

    public Cappuccino(Type typeDrink) {
        super(typeDrink);
    }

    @Override
    public void makingDrink() {
        System.out.println("Preparing Espresso coffee: " + PORTION_COFFEE + " gm;");
        System.out.println("Adding milk: " + PORTION_MILK + "gm;");
        System.out.println("Adding milk foam;");
        System.out.println("Pick up your Cappuccino!");
        System.out.println("--------------------------------------------");
    }
    @Override
    public int calculatePrice() {
        this.price = ((COFFEE * PORTION_COFFEE)  + (MILK * PORTION_MILK)) / 100;
        return super.calculatePrice();
    }
}
