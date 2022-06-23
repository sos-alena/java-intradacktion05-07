package com.hilel.lesson15.humandack;

public class Ship implements Swimmable{

    String name;
    @Override
    public void swim() {
        System.out.println("Ship can swim");
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                '}';
    }
}
