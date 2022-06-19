package homework.algorithmicTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BynarySearch {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("size: ");

        int[] arrays = {0, 15, 20, 7, 9, 46, 8, 28, 98, 3};

        for (int i = 0; i < arrays.length; i++) {

            arrays[i] = (int) (Math.random() * 100);
        }


        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));

        System.out.println("Number");
        int number = Integer.parseInt(READER.readLine());

        int max = arrays.length;
        int min = 0;
        int temp = ((max + min) / 2);
        for (int i = min; i < max; i++) {
            if (number <= temp) {

                System.out.print(arrays[i] + " ");
            }

            System.out.print(arrays[i] + " ");
        }
    }
}


