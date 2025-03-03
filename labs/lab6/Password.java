package labs.lab6;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the password:\n" +
                "1. The password should be at least 6 characters long.\n" +
                "2. The password should contain at least one uppercase and one lowercase letter\n" +
                "3. The password should have at least one digit.\n");

        String password = input.nextLine();

        int Digits = 0;
        int Uppercase = 0;
        int Lowercase = 0;
        int Length = password.length();

        boolean Vaild = true;

        for (int c = 0; c < password.length(); c++) {
            char x = password.charAt(c);
            if (Character.isUpperCase(x)) {
                Uppercase++;
            } else if (Character.isDigit(x)) {
                Digits++;
            } else if (Character.isLowerCase(x)) {
                Lowercase++;
            }

        }

        if (Length < 6) {
            System.out.println("not enough letter.");
            Vaild = false;
        }
        if (Digits < 1) {
            System.out.println("not enough numbers.");
            Vaild = false;
        }
        if (Uppercase < 1) {
            System.out.println("must have one uppercase letter.");
            Vaild = false;
        }
        if (Lowercase < 1) {
            System.out.println("must have one lowercase letter.");
            Vaild = false;
        }
        if (Vaild) {
            System.out.println("Password is valid!");
        }

    }
}
