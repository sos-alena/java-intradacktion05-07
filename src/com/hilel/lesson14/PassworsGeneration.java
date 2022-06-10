package com.hilel.lesson14;

public class PassworsGeneration {

    private static String UPPER = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
    private static String LOWER = UPPER.toLowerCase();
    private static String DIGITS = "0123456789";
    private static String SUMBOL = "_";

    public static void main(String[] args) {

     String password = getCode();
        System.out.println(password);

    }
    private static String getCode() {
        String strAllSymbol = UPPER + LOWER + DIGITS + SUMBOL;
        StringBuilder getPassword = new StringBuilder();
        getPassword.append(UPPER.charAt((int) (Math.random() * UPPER.length())))
                .append(LOWER.charAt((int) (Math.random() * LOWER.length())))
                .append(DIGITS.charAt((int) (Math.random() * DIGITS.length())))
                .append(SUMBOL)
                .append(symb(strAllSymbol));

                return shaffleCode(getPassword.toString());
    }

    private static String symb(String strAllSymbol){
        char[] piceCode = new char[4];

        for (int i = 0; i < piceCode.length; i++) {
            piceCode[i] = strAllSymbol.charAt((int) (Math.random() * strAllSymbol.length()));

        }
        return new String(piceCode);
    }

    private static String shaffleCode(String getPassword) {
        char[] newPass = getPassword.toCharArray();
        int index;
        char a;
        for (int i = 0; i < newPass.length; i++) {

            index = (int) (Math.random() * newPass.length);
            a = newPass[index];
            newPass[index] = newPass[i];
            newPass[i] = a;

        }
        return new String(newPass);
    }
}
