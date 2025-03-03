package practice;

//import java.util.Scanner;

public class Lowercase {
    public static void main(String[] args) {
       //Scanner scrn = new Scanner(System.in);
        Character [] letters = {'a', 'B', 'c', 'D','e'};
        int count = 0;
        boolean Lowercase = true;

        for (int i = 0; i < letters.length; i++){
            if (!Character.isLowerCase(letters[i])){
                Lowercase = false;
            }
            count++;
        }
        System.out.println(Lowercase);

    }
}