//package homeworks.homework3;
package com.gradescope.lab_three;

import java.util.Random;
import java.util.Scanner;

public class Powerball {

    public static int simulatePowerball(int seed, int[] inputWhiteBalls, int inputPowerBall) {
        Random rand = new Random(seed);

        // implement the following

        // validate inputWhiteBalls and inputPowerBall and return -1 if they are not
        // valid numbers
        if (inputPowerBall < 1 || inputPowerBall > 26) {
            return -1;
        }

        // draw random white balls while meeting the requirements
        for (int i = 0; i < inputWhiteBalls.length; i++) {
            if (inputWhiteBalls[i] < 1 || inputWhiteBalls[i] > 69) {
                return -1;
            }
            for (int j = i + 1; j < inputWhiteBalls.length; j++) {
                if (inputWhiteBalls[i] == inputWhiteBalls[j]) {
                    return -1;
                }
            }

        }
        // draw random power ball

        // calculate winnings by counting the matches between the input balls and the
        // randomly drawn balls
        int[] drawnWhite = new int[5];
        int drawnCount = 0;

        boolean unique = false;
        boolean duplicate = false;
        while (!unique) {
            while (drawnCount < 5) {
                drawnWhite[drawnCount] = rand.nextInt(69) + 1;
                for (int i = 0; i < drawnCount; i++) {
                    if (drawnWhite[i] == drawnWhite[drawnCount]) {
                        duplicate = true;
                        break;
                    }
                }
                if (duplicate) {
                    duplicate = false;
                    drawnCount = 0;
                    drawnWhite = new int[5];
                    break;
                }
                drawnCount++;
                if (drawnCount == 5) {
                    unique = true;
                }
            }

        }
        int Powerball = rand.nextInt(26) + 1;
        int Whiteballs = 0;
        for (int i = 0; i < inputWhiteBalls.length; i++) {
            for (int j = 0; j < drawnWhite.length; j++) {
                if (inputWhiteBalls[i] == drawnWhite[j])
                    Whiteballs++;
            }
        }

        boolean powerBallMatch = inputPowerBall == Powerball;

        // and return it as `prize` below.
        int prize = 0;
        if (Whiteballs == 5 && powerBallMatch) {
            prize = 100000000;
        } else if (Whiteballs == 5) {
            prize = 1000000;
        } else if (Whiteballs == 4 && powerBallMatch) {
            prize = 50000;
        } else if (Whiteballs == 4) {
            prize = 100;
        } else if (Whiteballs == 3 && powerBallMatch) {
            prize = 100;
        } else if (Whiteballs == 3) {
            prize = 7;
        } else if (Whiteballs == 2 && powerBallMatch) {
            prize = 7;
        } else if (Whiteballs == 1 && powerBallMatch) {
            prize = 4;
        } else if (Powerball == 1) {
            prize = 4;
        }

        return prize;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputWhiteBalls = new int[5];
        System.err.println("Enter your 5 white balls (1-69): ");
        for (int i = 0; i < 5; i++) {
            inputWhiteBalls[i] = scanner.nextInt();
        }

        System.out.println("Enter your Powerball (1-26): ");
        int inputPowerBall = scanner.nextInt();
        scanner.close();

        int prize = simulatePowerball(6, inputWhiteBalls, inputPowerBall);

        if (prize <= -1) {
            System.out.println("Invalid input! ");
        } else if (prize > 0) {
            System.out.println("Congratulations! You won: $" + prize);
        } else {
            System.out.println("Sorry, no prize this time. Try again soon. ");
        }

    }
}
