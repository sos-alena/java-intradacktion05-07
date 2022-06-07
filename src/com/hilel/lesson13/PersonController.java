package com.hilel.lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonController {


    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Person person = new Person("Mariana", 18);


        String name = READER.readLine();

        System.out.println(person.getAge());

        System.out.println(Person.DEFAULT_NAME);

        System.out.println(person);

        Person person1 = new Person(23);
        System.out.println(person1);

        System.out.println("Person count: " + Person.COUNT);
        System.out.println(person1.getName() + person1.getAge());

        person1.setAge(43);
        System.out.println(person1.getAge());

        Person.printCount();
        
  }

}
