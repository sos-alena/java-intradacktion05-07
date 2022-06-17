package com.hilel.lesson14.factoryMetod;

public class Coffeshop {

    public static void main(String[] args) {

    }

    private final SimpleCoffeeFactory coffeeFactory;

    public Coffeshop(SimpleCoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
        return coffee;
    }
}