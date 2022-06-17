package homework.lesson14.bilding;
public abstract class Building {
        protected int square;
        protected double rate;
        protected double taxes;
        public Building(int square, double rate) {
                this.square = square;
                this.rate = rate;
                this.taxes = summTaxes();

        }
        public double summTaxes() {
                double taxes = square * rate;
                return taxes;
        }
        @Override
        public String toString() {
                return "Building {" +
                        "square= " + square + "m^2" +
                        ", rate= " + rate + " EUR/m^2" +
                        ", taxes= " + taxes + " EUR "
                        + '}';
        }
}
