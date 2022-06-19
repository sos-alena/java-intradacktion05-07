package homework.lesson14.coffeMachine;
public class Tea extends Drinkables{
    private static final int TEA = 20; // стоимость чая 100 гр;
    private static final int PORTIONTEA = 20; // необходимая порция для заваривания чая;

    public Tea(Type typeDrink) {
        super(typeDrink);
    }
    @Override
    public void makingDrink() {
        super.makingDrink();
        System.out.println("Water 200 ml;");
        System.out.println("Tea: " + PORTIONTEA + " gm;");
        System.out.println("Pick up your Tea!");
        System.out.println("--------------------------------------------");
    }
    @Override
    public int calculatePrice() {
        this.price = TEA * PORTIONTEA / 100;
        return super.calculatePrice();
    }
}
