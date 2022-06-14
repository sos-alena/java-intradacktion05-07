package com.hilel.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Test {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final String BIGLETTER = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
    private static final String LOWLETTER = BIGLETTER.toLowerCase();
    private static final String NUMBER = "0123456789";
    private static final char UNDERSCOPE = '_';
    public static void main(String[] args) throws IOException {


        StringBuilder str = new StringBuilder()
                .append(BIGLETTER)
                .append(LOWLETTER)
                .append(NUMBER)
                .append(UNDERSCOPE);


        String piceStr2  = new String(getPiceStr(str));
        System.out.println(piceStr2);

        String code = String.valueOf(getCode(piceStr2));


        char[] result = code.toCharArray();


        char[] finalCode = shuffleCode(result);

        String finalCodeshuffle = new String(finalCode);
        System.out.println(finalCodeshuffle);


        ArrayList<String> listCode = new ArrayList<>();
            listCode.add(finalCodeshuffle);


        System.out.println(listCode);


    }

    public static char[] getPiceStr(StringBuilder str) throws IOException {
        System.out.println("Enter password size (size > 4): ");
        int size = getNumber(4);
       char[] piceStr = new char[size - 4];
        for (int i = 0; i < piceStr.length; i++) {
            piceStr[i] = (str.charAt((int) (Math.random() * str.length())));

        }
        return piceStr;
        }


    private static StringBuilder getCode(String piceStr2) throws IOException {

        StringBuilder getPassword = new StringBuilder()
                    .append(BIGLETTER.charAt((int) (Math.random() * BIGLETTER.length())))
                    .append(LOWLETTER.charAt((int) (Math.random() * LOWLETTER.length())))
                    .append(NUMBER.charAt((int) (Math.random() * NUMBER.length())))
                    .append(UNDERSCOPE)
                    .append(piceStr2);

        return getPassword;

            }

        private static char[] shuffleCode(char[] getPassword) {
            int index;
            char a;
            for (int i = 0; i < getPassword.length; i++) {
                index = (int) (Math.random() * getPassword.length);

                a = getPassword[index];
                getPassword[index] = getPassword[i];
                getPassword[i] = a;
            }
            return getPassword;
        }

        public static int getNumber(int min) throws IOException {
            try {
                int number = Integer.parseInt(READER.readLine());
                if (number < min){
                    System.out.println("Error: " + min);
                    System.out.println("Enter number again");
                    return getNumber(min);
                }
                return number;
            } catch (Exception exception) {
                System.out.println("Error: " + exception.getMessage());
                System.out.println("Enter number again");
                return getNumber(min);
            }

        }

    }

















