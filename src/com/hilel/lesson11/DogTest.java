package com.hilel.lesson11;

public class DogTest {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.run();

        dog.age = 12;
        dog.breed = "Bult";
        dog.size = "Large";
        dog.color = "white";

        System.out.println(dog.breed);
        System.out.println(dog.size);
        System.out.println(dog.age);
        System.out.println(dog.color);

        System.out.println();
        Dog dog2 = new Dog();
        dog.run();

        dog2.age = 8;
        dog2.breed = "Mastic";
        dog2.size = "Large";
        dog2.color = "red";

        System.out.println(dog2.breed);
        System.out.println(dog2.size);
        System.out.println(dog2.age);
        System.out.println(dog2.color);

        Dog dog3 = dog;

        System.out.println(dog);
        System.out.println(dog2);
        System.out.println(dog3);

        System.out.println(dog == dog2);
        System.out.println(dog.equals(dog2));
        System.out.println(dog == dog3);
        System.out.println(dog.equals(dog3));

        Dog dog4 = new Dog("Chow", "Medium", 2, "brown");
       System.out.println(dog4);

    }

}
