package com.hilel.lesson13;

public class Cat {

    private final String name;

    private final String bred;

    private int age;

    private int weigh;

    private int strength;

    public Cat(String name, String bred, int age, int weigh, int strength) {
        this.name = name;
        this.bred = bred;
        this.age = age;
        this.weigh = weigh;
        this.strength = strength;


    }

    public boolean fight(Object obj)
        {if (obj instanceof Cat) {
                Cat cat = (Cat) obj;
                if (this.age < cat.age && this.weigh > cat.weigh || this.strength > cat.strength) {
                    System.out.println("Cat is winner");
                }   else {
                    System.out.println("No, winner cat number 2");

                }
        }
            return false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", bred='" + bred + '\'' +
                ", age=" + age +
                ", weigh=" + weigh +
                ", strength=" + strength +
                '}';
    }
}

