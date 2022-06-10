package homework.lesson11;

import homework.usefulUtilities;

import java.io.IOException;

public class Password {
    private static final String BIGLETTER = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
    private static final String LOWLETTER = BIGLETTER.toLowerCase();
    private static final String NUMBER = "0123456789";
    private static final char UNDERSCOPE = '_';

    private final StringBuilder str = new StringBuilder().append(BIGLETTER).append(LOWLETTER).append(NUMBER).append(UNDERSCOPE);
    private final String Password;

    public Password() throws IOException {
        System.out.println("Create password");
        this.Password = getCode();
        System.out.println(Password);

    }
      private String getCode() throws IOException {
        System.out.println("Enter password size (size > 4): ");
        int size = usefulUtilities.getNumber(4);

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
    private String shuffleCode(char[] newCode) {
        int index;
        char a;
        for (int i = 0; i < newCode.length; i++) {
            index = (int) (Math.random() * newCode.length);

            a = newCode[index];
            newCode[index] = newCode[i];
            newCode[i] = a;
        }
        return new String(newCode);
    }
    public static Password[] createListPasswords(int numb) throws IOException {
        Password[] password = new Password[numb];
        for (int i = 0; i < password.length; i++) {
            password[i] = new Password();
        }
        return password;
    }
    @Override
    public String toString() {
        return "Password{" +
                "getPassword=" + Password +
                '}';
    }
}





