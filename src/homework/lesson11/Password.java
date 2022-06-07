package homework.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Password {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final String BIGLETTER = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
    private static final String LOWLETTER = BIGLETTER.toLowerCase();
    private static final String NUMBER = "0123456789";
    private static final char UNDERSCOPE = '_';

    private final StringBuilder str = new StringBuilder().append(BIGLETTER).append(LOWLETTER).append(NUMBER).append(UNDERSCOPE);
    private final char[] getPassword = getCode();

    public Password() throws IOException {
        System.out.println("Create password");
        System.out.println(getPassword);

    }
      private char[] getCode() throws IOException {
        System.out.println("Enter password size (size > 4): ");
        int size = getNumber(4);

          char[] newCode = new char[size];
                  newCode[0] = BIGLETTER.charAt((int) (Math.random() * BIGLETTER.length()));
                  newCode[1] = LOWLETTER.charAt((int) (Math.random() * LOWLETTER.length()));
                  newCode[2] = (NUMBER.charAt((int) (Math.random() * NUMBER.length())));
                  newCode[3] = (UNDERSCOPE);

            for (int i = 4; i < newCode.length; i++) {
                newCode[i] = (str.charAt((int) (Math.random() * str.length())));

            }

            return shuffleCode(newCode);

    }
    private char[] shuffleCode(char[] newCode) {
        int index;
        char a;
        for (int i = 0; i < newCode.length; i++) {
            index = (int) (Math.random() * newCode.length);

            a = newCode[index];
            newCode[index] = newCode[i];
            newCode[i] = a;
        }
        return newCode;
    }
    public static Password[] createListPasswords(int numb) throws IOException {
        Password[] password = new Password[numb];
        for (int i = 0; i < password.length; i++) {
            password[i] = new Password();
        }
        return password;
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
    @Override
    public String toString() {
        return "Password{" +
                "getPassword=" + Arrays.toString(getPassword) +
                '}';
    }
}





