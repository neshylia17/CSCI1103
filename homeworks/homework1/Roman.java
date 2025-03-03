package com.gradescope.lab_one; //package homeworks.homework1;

import java.util.Scanner;

public class Roman {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number to convert to Roman Numerals: ");
        int input = scanner.nextInt();
        System.out.println(convertRoman(input));
        scanner.close();
    }

    public static String convertRoman(int input) {
        if (input <1 || input >3999){
            return null;
        }
        int numTranslate = input;
        int numThousands = 0;
        int numHundreds = 0;
        int numTens =  0;
        int numOnes = 0;
        String romanNum = "";
        
        numThousands = numTranslate / 1000;
        numTranslate = numTranslate % 1000;
        numHundreds = numTranslate / 100;
        numTens = (numTranslate % 100)/10;
        numOnes = (numTranslate % 100)%10; 


        if (numThousands == 1){
            romanNum = romanNum + "M";
        }
        if (numThousands == 2){
            romanNum = romanNum + "MM";
        }
        if (numThousands == 3){
            romanNum = romanNum + "MMM";
        }
        if (numHundreds == 1){
           romanNum = romanNum + "C";
        }
        if (numHundreds == 2){
             romanNum = romanNum + "CC";
        }
        if (numHundreds == 3){
            romanNum = romanNum + "CCC";
        }
        if (numHundreds == 4){
            romanNum = romanNum + "CD";
        }
        if (numHundreds == 5){
            romanNum = romanNum + "D";
        }
        if (numHundreds == 6){
            romanNum = romanNum + "DC";
        }
        if (numHundreds == 7){
            romanNum = romanNum + "DCC";
        }
        if (numHundreds == 8){
            romanNum = romanNum + "DCCC";
        }
        if (numHundreds == 9){
            romanNum = romanNum + "CM";
        }
        if (numTens == 1){
            romanNum = romanNum + "X";
        }
        if (numTens == 2){
            romanNum = romanNum + "XX";
        }
        if (numTens == 3){
            romanNum = romanNum + "XXX";
        }
        if (numTens == 4){
            romanNum = romanNum + "XL";
        }
        if (numTens == 5){
            romanNum = romanNum + "L";
        }
        if (numTens == 6){
            romanNum = romanNum + "LX";
        }
        if (numTens == 7){
            romanNum = romanNum + "LXX";
        }
        if (numTens == 8){
            romanNum = romanNum + "LXXX";
        }
        if (numTens == 9){
            romanNum = romanNum + "XC";
        }
        if (numOnes == 1){
            romanNum = romanNum + "I";
        }
        if (numOnes == 2){
            romanNum = romanNum + "II";
        }
        if (numOnes == 3){
            romanNum = romanNum + "III";
        }
        if (numOnes == 4){
            romanNum = romanNum + "IV";
        }
        if (numOnes == 5){
            romanNum = romanNum + "V";
        }
        if (numOnes == 6){
            romanNum = romanNum + "VI";
        }
        if (numOnes == 7){
            romanNum = romanNum + "VII";
        }
        if (numOnes == 8){
            romanNum = romanNum + "VIII";
        }
        if (numOnes == 9){
            romanNum = romanNum + "IX";
        }


    



        System.out.println(input + " in Roman Numerals is " + romanNum);
        return romanNum;
    }
}