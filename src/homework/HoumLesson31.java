package homework;

import static java.lang.Math.*;

public class HoumLesson31 {

    public static void main(String[] args) {

        float a = 2f;
        System.out.println("a = " + a);

        float b = 1f;
        System.out.println("b = " + b);

        float c = 4f;
        System.out.println("c = " + c);

                ///     | a- b | / (a + b) ^3 - √c


        System.out.println("Вычислим результат выражения по следующей формуле: | a - b | / (a + b) ^3 - √c;");

        double result = abs(a - b) / pow((a + b), 3) - sqrt(c);
        System.out.println(result);
    }
}
