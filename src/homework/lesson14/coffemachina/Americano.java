package homework.lesson14.coffemachina;

public class Americano extends Drink {
    private static final int PRICE_COFFEE = 40; // стоимость кофе за 100 гр
    private static final int PORTION_COFFEE = 22; // необходимая порция для приготовления 1 чашки еспрессо

    public Americano(Type typeDrink) {
        super(typeDrink);
    }

    @Override
    public void makingDrink() {
        System.out.println("Preparing Espresso coffee: " + PRICE_COFFEE + "gm");
        System.out.println("Adding water 1/3;");
        System.out.println("Pick up your Americano!");
        System.out.println("----------------------------------------------");
    }
    @Override
    public int calculatePrice() {
        this.price = PRICE_COFFEE * PORTION_COFFEE / 100;
        return super.calculatePrice();
    }
}
