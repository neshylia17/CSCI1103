//package homeworks.homework2;
package com.gradescope.lab_two; // Make sure this line of code is included in your final submission

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Orientation {
    public static void main(String args[]) {
        List<String> simResults = simulateRandomWork(42);
        // Prints a list of Strings
        System.out.println(simResults);
    }

    // Your task is to implement this function
    public static List<String> simulateRandomWork(int seed) {
        int n; // represents the starting block

        Random random = new Random(); // instance of random class
        random.setSeed(seed); // we fix the random generator so that same sequence of "random" numbers will be
                              // generated each time we run the program.

        // Implement

        List<String> simResults = new ArrayList<>();
        for (n = 2; n < 8; n++) {
            int block;

            int checkC = 0;
            int checkO = 0;
            int totalSteps = 0;

            for (int i = 0; i < 500; i++) {

                block = n;

                int steps = 0;

                // Implement another loop below that simulates i-th single trip,
                // inside the loop, you can generate one random integer number from 1 to 5 as:
                while (block < 8 && block > 1) {
                    steps++;
                    int randomNum = random.nextInt(5) + 1;
                    if (randomNum <= 3) {
                        block++;
                    } else {
                        block--;
                    }
                }

                if (block == 8) {
                    checkO++;
                }
                if (block == 1) {
                    checkC++;
                }
                totalSteps = steps + totalSteps;

            }

            // Compute the variables below that summarizes the 500 trips
            double orientationPercent = (checkO / 500.0) * 100;
            double avgSteps = (totalSteps / 500.0);
            double carPercent = (checkC / 500.0) * 100;

            // ==================== WARNING: Do not change the code below!
            // ====================
            // Your task is to compute all the variables (i.e., n, orientationPercent,
            // avgSteps, CarPercent) that are required to form the single String below.
            String blockSimResult = String.format("After 500 trips starting on block %d,\n", n) +
                    String.format("the student makes it to orientation %.1f%% of the time,\n", orientationPercent) +
                    String.format("with an average of %.3f steps per trip.\n\n", avgSteps) +
                    String.format("After 500 trips starting on block %d,\n", n) +
                    String.format("the student makes it to the car %.1f%% of the time,\n", carPercent) +
                    String.format("with an average of %.3f steps per trip.\n\n", avgSteps);
            // ==================== WARNING: Do not change the code above!
            // ====================

            // We add the simulation result (String) for each start block to our List,
            // simResults
            simResults.add(blockSimResult);
        }
        return simResults;
    }
}