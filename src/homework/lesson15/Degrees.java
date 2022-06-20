package homework.lesson15;

public abstract class Degrees implements Converterable{

    protected int degree;

    public Degrees(int degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Degrees{" +
                "degree=" + degree +
                '}';
    }
}
