package homework.algorithmicTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ShiftArray {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите размер массива, количество элиментов: ");
        int size = Integer.parseInt(READER.readLine());
        System.out.println("Введите шаг сдвига влево/вправо (например 2): ");
        int numb = Integer.parseInt(READER.readLine());

        int[] number = CreateFillArray(numb, size);
        System.out.println(Arrays.toString(number));

        System.out.println("Сдвиг вправо: ");
        int[] newNumberRigth = shiftRigth(numb, number);
        System.out.println(Arrays.toString(newNumberRigth));

        System.out.println("Сдвиг влево: ");
        int[] newNumberLeft = (shiftLeft(numb, number));
        System.out.println(Arrays.toString(newNumberLeft));

    }
    private static int[] shiftLeft(int numb, int[] number) {
        int temp;
        int j = numb;
        for (int i = 0; i < number.length - numb; i++, j++) {
            temp = number[j];
            number[j] = number[i];
            number[i] = temp;
        }
        return number;
    }
    private static int[] shiftRigth(int numb, int[] number) {
        int temp;
        int j = number.length - 1 - numb;
        for (int i = number.length - 1; i >= numb; i--, j--) {
            temp = number[j];
            number[j] = number[i];
            number[i] = temp;
        }

        return number;
    }
    private static int[] CreateFillArray(int numb, int size) {
        if (size % numb != 0) {                              ///Если размер массива кратный "сдвигу", то количество итераций хватит для полного перебора массива
            int y = numb - (size % numb);                   /// Если нет, то нехватит итераций для прохождения полного цикла, результат будет некорректный
            int[] number2 = new int[size + y];              /// вычесляем ннеобходимое количество итерраций и добавляем к размеру нового массива
            System.out.println("Новый размер массива: " + (size + y));
            for (int i = 0; i < number2.length; i++) {
                number2[i] = (int) (Math.random() * 100);
            }
            return number2;
        }
        int[] number = new int[size];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 100);
        }
        return number;
    }
}
