package com.hilel.lesson14;

import java.util.ArrayList;
import java.util.List;

import static com.hilel.lesson14.Animal.DEFAULT_COLOR;

public class PetStore {

    public static void main(String[] args) {

        Animal cat = new Cat(DEFAULT_COLOR, "Siam");
        Animal dog = new Dog();
        Animal cat2 = new Cat(DEFAULT_COLOR, "Dvornic");

        List<Animal> animals = new ArrayList<>();

        animals.add(cat);
        animals.add(dog);
        animals.add(cat2);
        animals.add(new Rat("Gray"));

        for (Animal animal : animals) {
            animal.speak();

        }

        handleAnimals(animals);
    }

        private static void handleAnimals (List < Animal > animals) {
            for (Animal animal : animals) {
                animal.speak();

                if (animal instanceof Rat) {
                    Rat rat = (Rat) animal;
                    rat.steal();
                }
            }

        }
    }
