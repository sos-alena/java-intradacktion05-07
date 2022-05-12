package com.hilel.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Swith {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number: ");
        int number = Integer.parseInt(reader.readLine());
        System.out.println("number: " + number);

        printMounth(number);
        printSeason(number);
    }

    private static void printMounth(int number) {
        switch (number) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("Okt");
                break;
            case 11:
                System.out.println("Nov");

            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Unknown month number");
                break;
        }
    }
        private static void printSeason(int number) {
            switch (number) {

                case 12:
                case 1:
                case 2:
                    System.out.println("Winter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Aoutom");
                    break;
                default:
                    System.out.println("Unknown month number");
                    break;
            }
        }
    }

