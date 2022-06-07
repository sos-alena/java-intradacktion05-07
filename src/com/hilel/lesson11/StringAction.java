package com.hilel.lesson11;

import java.nio.charset.Charset;

public class StringAction {

    public static void main(String[] args) {


        String habr = "habrahabr";

        char[] habrAsArrayOfChars = {'h', 'a', 'b', 'r', 'a', 'h', 'a', 'b', 'r'};
        byte[] habrAsArrayOfBytes = {104, 97, 98, 114, 97, 104, 97, 98, 114};

        String first = new String();
        String second = new String(habr);
        String third = new String(habrAsArrayOfChars);
        String fourth = new String(habrAsArrayOfBytes, 0, 4);
        String fifth = new String(habrAsArrayOfBytes, Charset.forName("ASCII"));

        String sixth = new String(new StringBuffer(habr));
        String seventh = new String(new StringBuilder(habr));

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);

        System.out.print("JavaRush".charAt(0)); // Символ charAt - возвращает значениее char по указанному символу
        System.out.print("JavaRush".charAt(1));
        System.out.print("JavaRush".charAt(2));
        System.out.print("JavaRush".charAt(3));

        StringBuilder str = new StringBuilder()
                .append(habrAsArrayOfBytes)
                .append(habr);

        System.out.println(str);



    }
}
