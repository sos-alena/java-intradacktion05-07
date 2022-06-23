package homework.lesson15;
public class Fahrenheit implements Converterable{
    @Override
    public int convert(int temp) {
        int result = temp * 9 / 5 + 32;
        System.out.println("Degrees Fahrenheit °F = " + result);
        return result;
    }
}
