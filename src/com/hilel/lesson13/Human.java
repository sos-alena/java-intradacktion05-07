package com.hilel.lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Human {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final String[] NAMES = {"Misha", "Sasha", "Piter", "Oleg", "Anton", "Valera",
                                            "Olya", "Nastya", "Tanya", "Ira", "Inna", "Masha"};
    public static int COUNT = 1;
    private final String name;

    public Human() throws IOException {
        this.name = NAMES[((int) (Math.random() * NAMES.length))];
    }

    public static Human[] createlistOfPeople(int numb) throws IOException {
        Human[] humans = new Human[numb];
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human();
            System.out.println(humans[i]);
            isParents(humans[i]);
        }
        return humans;
    }
    public static void isParents(Object obj) {
        if (obj instanceof Human human) {
            switch (human.name) {
                case "Olya":
                    System.out.println("Olya is Mather of Ira and Sasha");
                    break;
                case "Inna":
                    System.out.println("Inna is Mather of Valera and Oleg and Nastya ");
                    break;
                case "Tanya":
                    System.out.println("Tanya is Mather of Masha");
                    break;
                case "Nastya":
                    System.out.println("Nastya is daughter of Inna and Misha");
                    break;
                case "Ira":
                    System.out.println("Ira is daughter of Olya and Piter");
                    break;
                case "Masha":
                    System.out.println("Masha is daughter of Tanya and Anton");
                    break;
                case "Misha":
                    System.out.println("Misha is father of Valera and Oleg and Nastya");
                    break;
                case "Piter":
                    System.out.println("Piter is father of Ira and Sasha");
                    break;
                case "Anton":
                    System.out.println("Anton is father of Masha");
                    break;
                case "Sasha":
                    System.out.println("Sasha is son of Olya and Piter");
                    break;
                case "Oleg":
                    System.out.println("Oleg is son of Inna and Misha");
                    break;
                case "Valera":
                    System.out.println("Valera is son of Inna and Misha");
                    break;
                default:
                    System.out.println("Unknown value");
                    break;
            }
        }
    }

    public static int getNumber() throws IOException {
        try {
            int number = Integer.parseInt(READER.readLine());
            if (number < 1) {
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
        public String toString () {
            return "Human №" + (COUNT++) + "{" +
                    "name='" + name + '\'' +
                    '}';
        }

    }

