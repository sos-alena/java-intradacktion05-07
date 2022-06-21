package homework.lesson14.coffemachina;
public class Tea extends Drink{
    private static final int TEA = 20; // стоимость чая 100 гр;
    private static final int PORTION_TEA = 20; // необходимая порция для заваривания чая;

    public Tea(Type typeDrink) {
        super(typeDrink);
    }
    @Override
    public void makingDrink() {
        System.out.println("Water 200 ml;");
        System.out.println("Tea: " + PORTION_TEA + " gm;");
        System.out.println("Pick up your Tea!");
        System.out.println("--------------------------------------------");
    }
    @Override
    public int calculatePrice() {
        this.price = TEA * PORTION_TEA / 100;
        return super.calculatePrice();
    }
}
