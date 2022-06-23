package homework.lesson15;

public class Kelvins implements Converterable {
    @Override
    public int convert(int temp) {
        temp += 273;
        System.out.println("Degrees Kelvin K " + temp);
        return temp;
    }
}
