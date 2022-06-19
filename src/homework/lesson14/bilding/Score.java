package homework.lesson14.bilding;

public class Score extends Building {
    private final int proceeds; // Выручка
    public Score(int square, double rate, int proceeds) {
        super(square, rate);
        this.proceeds = proceeds;
    }
    @Override
    public double summTaxes() {
        super.summTaxes();
        if (proceeds > 100) {
            return super.summTaxes();
        }
        return 0;
    }
    @Override
    public String toString() {
        return "Score {" +
                "square = " + square + " m^2" +
                ", rate = " + rate + " EUR/m^2 " +
                ", proceeds = " + proceeds + " EUR" +
                '}';
    }
}
