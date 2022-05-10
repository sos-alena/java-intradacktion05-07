package com.hilel.Lesson4;

import java.util.Scanner;

public class Box {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Width, Heigth, Depth: ");
        int Width = scanner.nextInt();
        int Heigth = scanner.nextInt();
        int Depth = scanner.nextInt();
        int volume = boxVolume(Width, Heigth, Depth);
        System.out.println("Box volume = width * Heigth * Depth: " + volume + ";");



    }

    public static int boxVolume(int Width, int Heigth, int Depth) {
        return (int) (Width * Heigth * Depth);


    }


}
