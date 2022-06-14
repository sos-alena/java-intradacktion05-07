package homework.algorithmicTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumSearch {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        int[] number = {0, 22, 55, 18, 9, 6, 7, 15, 3, 12};
        System.out.println("Введите искомую сумму:");
        int sum = Integer.parseInt(READER.readLine());

        for (int i = 0; i < number.length-1; i++) {
            for (int j = 1; j < number.length; j++) {
                if (j > i) {
                    if (sum - number[i] == number[j]) {
                        System.out.println("Первое число - " + number[i]
                                + " Индекс: " + i + " ; Второе число - "
                                + number[j] + " индекс: " + j);
                    }
                }
            }
        }
    }
}
