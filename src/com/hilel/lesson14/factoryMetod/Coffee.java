package com.hilel.lesson14.factoryMetod;

public class Coffee {


    public void grindCoffee(){
        System.out.println("Перемалываем кофе");
    }
    public void makeCoffee(){
        System.out.println("Делаем кофе");
    }
    public void pourIntoCup(){
        System.out.println("Наливаем в чашку");

    }

}
enum CoffeeType {
    ESPRESSO,
    AMERICANO,
    CAFFE_LATTE,
    CAPPUCCINO
}