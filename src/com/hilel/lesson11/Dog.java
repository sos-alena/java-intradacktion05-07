package com.hilel.lesson11;

public class Dog {

    String breed;
    String size;
    int age;
    String color;

    public Dog() {
        System.out.println("Dog has been created!");

    }

    public Dog(String breed, String size, int age, String color){

        this.breed = breed;
        this.color = color;
        this.size = size;
        this.age = age;
    }

    public void run() {
        System.out.println("Dog runs");
    }

    public boolean equals(Object obj) { // Obj - это будет параметр с катором будем сравнивать текущий объект (наш dog)

        if (obj instanceof Dog) {
            Dog dog = (Dog) obj;

            if (this.size.equals(dog.size) && this.age == dog.age) // this - это наш dog, т.е. этот текущий объект;
            {
                return true;
            }

        }


        return false;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
