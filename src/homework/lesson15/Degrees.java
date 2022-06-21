package homework.lesson15;

public abstract class Degrees implements Converterable{

    protected int degree;
    protected Type typeDegree;


    @Override
    public String toString() {
        return "Degrees{ " +
                "degree=" + degree +
                ", typeDegree=" + typeDegree +
                '}';
    }
}

enum Type {
    CELSIUS,
    FAHRENHEIT,
    KELVINS
}
