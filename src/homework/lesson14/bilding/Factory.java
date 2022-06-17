package homework.lesson14.bilding;

import homework.lesson14.bilding.Building;

public class Factory extends Building {
    public Factory(int square, double rate) {
        super(square, rate);
    }
    @Override
    public String toString() {
        return "Factory {" +
                "square= " + square + "m^2" +
                ", rate= " + rate + " EUR/m^2" +
                ", taxes= " + taxes + " EUR "
                + '}';
    }
}
