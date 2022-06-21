package homework.lesson14.building;

public abstract class Building {
        protected int square;
        protected double rate;

        public Building(int square, double rate) {
                this.square = square;
                this.rate = rate;
        }

        public double summTaxes() {
                double taxes = square * rate;
                return taxes;
        }

        @Override
        public String toString() {
                return "Building {" +
                        "square= " + square +
                        ", rate= " + rate + "EUR / m^2" +
                        '}';
        }
}
