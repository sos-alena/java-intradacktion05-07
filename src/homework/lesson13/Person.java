package homework.lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static int COUNT = 1;
    private static final String[] NAMES = {"Misha", "Sasha", "Piter", "Oleg", "Anton", "Valera"};
    private static final String[] SHURNAMES = {"Ivanov", "Mendeleev", "Peterson", "Grinyuk", "Shevchuk", "Vunshtein"};

    private final String name;
    private final String surname;
    private final int height;
    private int age, weight;
    public Person() {
        this.name = NAMES[((int) (Math.random() * NAMES.length))];
        this.surname = SHURNAMES[(int) (Math.random() * SHURNAMES.length)];
        this.age = (int) (Math.random() * (35 - 18) + 18);
        this.weight =(int) (Math.random() * (100 - 65) + 65);
        this.height = (int) (Math.random() * (200 - 160) + 160);
    }
    public static Person[] createListPerson(int students){
    Person[] person = new Person[students];
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();
            System.out.println(person[i]);
        }
        return person;
    }
    public static int getNumber() throws IOException {
        try {
            int number = Integer.parseInt(READER.readLine());
            if (number < 0) {
                System.out.println("Error. Input number is out of range! ");
                System.out.println("Enter a number greater than four");
                return getNumber();
            }
            return number;
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            System.out.println("Enter number again");
            return getNumber();
        }
    }
    @Override
    public String toString() {
        return "Person № " + (COUNT++) + "{" +
                "name  " + name + '\'' +
                ", surname " + surname + '\'' +
                ", age  " + age +
                ", weight  " + weight +
                ", height  " + height +
                '}';
    }
}

