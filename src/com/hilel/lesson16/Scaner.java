package com.hilel.lesson16;

import java.util.Scanner;

public class Scaner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner("""
                Люблю тебя, Петра творенье,
                Люблю твой строгий, стройный вид,
                Невы державное теченье,
                Береговой ее гранит""");

        String s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number);
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }

    }
}


