package homework.lesson14.coffeMachine;
public class Drinkables {
    private static final int MARKUP = 25; // наценка на напитки
    protected int price;
    protected Type typeDrinkables;

    public Drinkables(Type typeDrinkables) {
        this.price = calculatePrice();
        this.typeDrinkables = typeDrinkables;
        makingDrink();
    }

    public void makingDrink(){
        System.out.println("Choose a drink: ");
        System.out.println("Drink is being prepared....");
    }
    public int calculatePrice() {
        price += price * MARKUP / 100;
        return price;
    }
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drink - " + typeDrinkables +
                ", price= " + price + " EUR";
    }
}
enum Type{
    LATTE,
    CUPPUCCINO,
    AMERICANO,
    TEA
}



