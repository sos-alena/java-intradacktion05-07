package com.hilel.lesson13;

public class CatFight {

    public static void main(String[] args) {

        Cat cat = new Cat("Murzic", "Dvornyaga", 8, 17, 50);
        System.out.println(cat.toString());

        Cat cat2 = new Cat("Vasya", "Siam", 3, 5, 80);
        System.out.println(cat2.toString());

        int count = 0;
        for (int i = 0; i < 3; i++) {
            cat.fight(cat2);
            count++;
        }
        System.out.println("Number fight" + count);

    }
}
