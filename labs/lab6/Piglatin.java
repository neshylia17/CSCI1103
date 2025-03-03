package labs.lab6;

import java.util.Scanner;

public class Piglatin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence in english:\n");

        String english = input.nextLine();
        String piglatin = " ";

        String[] aarayofwords = english.split(" ");

        for (int i = 0; i < aarayofwords.length; i++) {
            piglatin += aarayofwords[i].substring(1) + aarayofwords[i].substring(0, 1) + "ay" + " ";
        }

        System.out.println(piglatin);

    }
}
