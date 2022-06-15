package com.hilel.lesson14;

public class Animal {

    public static String DEFAULT_COLOR = "white";

    protected String color;

    public Animal(String color) {
        this.color = color;
    }

    public void speak(){
        System.out.println("Animal speaks");
    }
}
