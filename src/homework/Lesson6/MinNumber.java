package homework.Lesson6;

import java.io.IOException;

public class MinNumber {

    public static void main(String[] args) throws IOException {

        int number = generateRandom();
        System.out.println(number);

        int number1 = generateRandom();
        System.out.println(number1);

        int number2 = generateRandom();
        System.out.println(number2);


        int result = minNumber(number, number1, number2);
        System.out.println("Min number " + result);


    }

    public static int generateRandom() {
        return (int) (Math.random() * 100);
    }

    public static int minNumber(int N, int N2, int N3) {

        if (N < N2 && N < N3 || N == N2 && N2 < N3 || N == N3 && N3 < N2) {
            return (N);
        } else if (N2 < N && N2 < N3 || N2 == N3 && N3 < N) {
            return (N2);
        } else if (N3 < N) {
            return (N3);
        } else {
            System.out.println("All three numbers are equal");
        }
        return 0;






    }

}


