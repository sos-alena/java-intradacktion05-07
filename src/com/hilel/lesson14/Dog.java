package com.hilel.lesson14;

public class Dog extends Animal {

    public Dog() {
        super("Black");
    }

    @Override
    public void speak()  {
        System.out.println("gav");
        action();

    }
    private void action() {
        System.out.println("Виляет хвостиком ");
    }
}
