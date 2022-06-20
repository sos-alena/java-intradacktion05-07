package homework.lesson15;

public class Celsius extends Degrees {

    public Celsius(int degree) {
        super(degree);
    }
    @Override
    public void convert() {
        System.out.println("HI!");
        int result = (this.degree * 9/5) + 32;
        System.out.println("degree Celsius: " + this.degree + "C" + " = degree Fahrenheit: " + result + "F");
    }
}
