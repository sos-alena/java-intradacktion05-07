package homework.lesson14.coffemachina;
public class Drink {
    private static final int MARKUP = 25; // наценка на напитки
    protected int price;
    protected Type typeDrink;

    public Drink(Type typeDrink) {
        this.price = calculatePrice();
        this.typeDrink = typeDrink;
    }
    public void makingDrink(){
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
        return "Drink {" +
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



