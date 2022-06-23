package com.hilel.lesson15.humandack;

public class Human implements Runnable, Swimmable{

    String name;
    @Override
    public void swim() {
        System.out.println("Human can swim!");
    }

    @Override
    public void runn() {
        System.out.println("Human can runn!");

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}
