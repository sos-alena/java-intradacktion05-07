package homework.lesson14.bilding;

public class Flat extends Building {
    private final double benefit; //субсидии, процентное выражение к общей сумме налога;

    public Flat(int square, double rate, double benefit) {
        super(square, rate);
        this.benefit = benefit;
        this.taxes = summTaxes();
    }
    @Override
   public double summTaxes() {
        super.summTaxes();
        taxes = super.summTaxes() - (super.summTaxes() * benefit / 100);
        return taxes;
    }

    @Override
    public String toString() {
        return "Flat {" +
                "square= " + square + " m^2" +
                ", rate= " + rate + " EUR/m^2" +
                ", benefit= " + benefit + "%" +
                ", taxes= " + taxes + " EUR " +
                '}';
    }
}
