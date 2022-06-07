package homework.lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static int COUNT = 1;
    public static final String[] NAMES = {"Misha", "Sasha", "Piter", "Oleg", "Anton", "Valera"};
    public static final String[] SHURNAMES = {"Ivanov", "Mendeleev", "Peterson", "Grinyuk", "Shevchuk", "Vunshtein"};


    private final String name;
    private final String surname;
    private final int height;
    private int age, weight;

    public Person() {

        this.name = Person.NAMES[((int) (Math.random() * Person.NAMES.length))];
        this.surname = Person.SHURNAMES[(int) (Math.random() * Person.SHURNAMES.length)];
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

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;

             return this.name == person.name &&
                    this.surname == person.surname &&
                     this.age == person.age &&
                     this.weight == person.weight &&
                     this.height == person.height;
        }

        return false;
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

