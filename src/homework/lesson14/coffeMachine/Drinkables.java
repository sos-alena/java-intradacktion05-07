package homework.lesson14.coffeMachine;
public class Drinkables {
    private static final int MARKUP = 25; // наценка на напитки
    protected int price;
    protected Type typeDrink;

    public Drinkables(Type typeDrink) {
        this.price = calculatePrice();
        this.typeDrink = typeDrink;
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
        return "Drinkables {" +
                "price= " + price + " EUR" +
                ", typeDrink= " + typeDrink +
                '}';
    }
}
enum Type{
    LATTE,
    CUPPUCCINO,
    AMERICANO,
    TEA
}



