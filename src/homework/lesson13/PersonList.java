package homework.lesson13;


import java.io.IOException;

public class PersonList {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the number of students (example 100): ");
        int students = Person.getNumber();

        Person[] person = Person.createListPerson(students);

    }

}





