package homework.lesson15;

public class Convert {

    public static void main(String[] args) {

       Degrees c = new Celsius(20);
       Degrees f = new Fahrenheit(30);
       Degrees k = new Kelvins(4);

        c.convert();
        System.out.println(c);
    }
}
