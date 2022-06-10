package homework.lesson13;

public class Person {
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
    public static Person[] createListPerson(int number){
    Person[] persons = new Person[number];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
            System.out.println(persons[i]);
        }
        return persons;
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

