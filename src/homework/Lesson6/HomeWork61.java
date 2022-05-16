package homework.Lesson6;

public class HomeWork61 {

    public static void main(String[] args) {

        int number = generateRandom();
        System.out.println(number);

        int number1 = generateRandom();
        System.out.println(number1);

        int number2 = generateRandom();
        System.out.println(number2);

        minNumber(number, number1, number2);

    }

    public static int generateRandom() {
        return (int) (Math.random() * 100);
    }

    public static void minNumber(int N, int N2, int N3) {
        if (N < N2 && N < N3) {
            System.out.println("Min number " + N);
        } else if (N2 < N && N2 < N3) {
            System.out.println("Min number " + N2);
        } else if (N3 < N && N3 < N2) {
            System.out.println("Min number " + N3);
        } else {
            System.out.println("Two or three identical numbers");
        }

    }
}


