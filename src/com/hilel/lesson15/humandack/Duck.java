package com.hilel.lesson15.humandack;

public class Duck implements Runnable, Swimmable, Flyable{

    String name;
    @Override
    public void fly() {
        System.out.println("Dack can fly!");
    }

    @Override
    public void runn() {
        System.out.println("Dack can runn!");
    }

    @Override
    public void swim() {
        System.out.println("Dack can swim!");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                '}';
    }
}
