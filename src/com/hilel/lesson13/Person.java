package com.hilel.lesson13;

public class Person {

    public static final String DEFAULT_NAME = "unknown";
    public static int COUNT = 0;

    private final String name;
    private int age;


    public Person(int age){

        this.name = DEFAULT_NAME;
        this.age = age;
        COUNT++;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        secretAction();
        COUNT++;
    }

    private void secretAction() {
        System.out.println(this.name);
        System.out.println("Secret action");
        printCount();

    }

    public static void printCount() {
        System.out.println("Count: " + COUNT);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
