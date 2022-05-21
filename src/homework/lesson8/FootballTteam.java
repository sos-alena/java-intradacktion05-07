package homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FootballTteam {


    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int[] firstPlayers = new int[11];
        int[] secondPlayers = new int[11];

        System.out.println("Enter the minimum player return: ");
        int max = getNumber();
        System.out.println("Enter the maximum return of the player: ");
        int min = getNumber();

        System.out.println();
        fillArray(firstPlayers, max, min);
        System.out.println("Age of players first team: ");
        printArray(firstPlayers);
        System.out.println();
        int avAge = average(firstPlayers);
        System.out.println("Average age of players first team: " + avAge);

        System.out.println();

        fillArray(secondPlayers, max, min);
        System.out.println("Age of players second team: ");
        printArray(secondPlayers);
        System.out.println();
        int avAge2 = average(secondPlayers);
        System.out.println("Average age of players second team: " + avAge2);
        System.out.println();
        difference(avAge, avAge2);


    }


    public static void fillArray(int[] array, int max, int min) throws IOException {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min) + min);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < (array.length - 1)) {
                System.out.print(array[i] + ";");

            } else {
                System.out.print(array[i] + ".");
            }

        }

    }

    public static int average(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;

        }
        return sum / array.length;
    }

    private static void difference(int numb, int numb2) {
        if (numb > numb2) {
            System.out.println("Average age of the first team is greater than that of the second team!");
        } else if (numb < numb2) {
            System.out.println("Average age of the second team is greater than that of the first team!");

        } else {
            System.out.println("The average age of both teams is equal!");
        }

    }

    private static Integer getNumber() {
        try {
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            System.out.println("Enter number again");
            return getNumber();
        }
    }


}

