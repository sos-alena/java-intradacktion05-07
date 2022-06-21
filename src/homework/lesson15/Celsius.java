package homework.lesson15;

public class Celsius extends Degrees {
    @Override
    public int convert(int degree, String str) {
        typeDegree = Type.valueOf(str);
        return switch (typeDegree) {
            case FAHRENHEIT -> convertFahrenheit(degree);
            case KELVINS -> convertKelvins(degree);
            default -> throw new IllegalStateException("Unexpected value: " + typeDegree);
        };
    }
    private int convertFahrenheit(int degree) {

        System.out.println("Convert degrees Celsius to degrees Fahrenheit: ");
        int degreeF = ((degree * 9 / 5) + 32);
        System.out.println("degree Celsius: " + degree + "°C" + " = degree Fahrenheit: " + degreeF + "°F");
        return degreeF;
    }

    private int convertKelvins(int degree) {

        System.out.println("Convert degrees Celsius to degrees Kelvins: ");
        int degreeK = (degree + 273);
        System.out.println("degree Celsius: " + degree + "°C" + " = degree Kelvins: " + degreeK + "°K");
        return degreeK;
    }
}