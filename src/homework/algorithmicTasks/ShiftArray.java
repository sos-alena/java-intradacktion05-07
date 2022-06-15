package homework.algorithmicTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ShiftArray {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Enter array size, number of elements: ");
        int size = Integer.parseInt(READER.readLine());
        System.out.println("Enter left/right shift step (for example 2): ");
        int numb = Integer.parseInt(READER.readLine());

        int[] number = CreateFillArray(size);
        System.out.println(Arrays.toString(number));

        int[] newNumberRigth = (shiftRigth(numb, number));
        System.out.println(Arrays.toString(newNumberRigth));

        System.out.println("_____________________________________________________________");
        int[] number2 = CreateFillArray(size);
        System.out.println(Arrays.toString(number2));

        int[] newNumberleft = (shiftLeft(numb, number2));
        System.out.println(Arrays.toString(newNumberleft));

    }
    private static int[] shiftRigth(int numb, int[] number) {
        System.out.println("Shift rigth: ");
        for (int i = 0; i < numb; i++) {
            int temp;
            int x = 0;
            for (int j = 1; j < number.length; j++) {
                temp = number[j];
                number[j] = number[x];
                number[x] = temp;
            }
        }
        return number;
    }
    private static int[] shiftLeft(int numb, int[] number) {
        System.out.println("Shift left: ");
        for (int i = 0; i < numb; i++) {
            int temp;
            int x = number.length-1;
            for (int j = number.length-1; j >= 0; j--) {
                temp = number[j];
                number[j] = number[x];
                number[x] = temp;
            }
        }
        return number;
    }
    private static int[] CreateFillArray(int size) {
            int[] number = new int[size];
            for (int i = 0; i < number.length; i++) {
                number[i] = (int) (Math.random() * 100);
            }
            return number;
        }
}
