package com.hilel.lesson8;

public class ArrayLinc {

    public static void main(String[] args) {

        String[] strings = new String[3];


        printArray(strings);
        System.out.println(strings);

        fillArray(strings);
        System.out.println(strings);

        String[] newStrings = createAndFill(10);
        printArray(newStrings);

       /* String[] anotherstrings = strings;
        System.out.println(anotherstrings);


        anotherstrings[0] = "newtext";
        System.out.println(strings[0]);
        System.out.println(anotherstrings[0]);*/
    }

    public static void printArray(String[] strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void fillArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "str" + i;

        }

    }

        public static String[] createAndFill(int size){
            String[] strings = new String[size];
            fillArray(strings);
            return strings;
        }
    }

