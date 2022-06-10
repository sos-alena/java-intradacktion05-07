package homework.lesson13;

import java.io.IOException;

import static homework.usefulUtilities.getNumber;
public class PersonList {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the number of persons (example 100): ");
        int number = getNumber();

        Person[] person = Person.createListPerson(number);
    }
}





