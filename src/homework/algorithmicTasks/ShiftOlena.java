package homework.algorithmicTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ShiftOlena {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int size = Integer.parseInt(READER.readLine());
        int[] arrays = new int[size];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arrays));


        for (int i = 0; i < 2; i++) {
            int index = 0;
            for (int j = 1; j < arrays.length; j++) {
                int x;
                x = arrays[j];
                arrays[j] = arrays[index];
                arrays[index] = x;

            }

        }
        System.out.println(Arrays.toString(arrays));

    }

}
