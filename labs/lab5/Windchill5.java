package labs.lab5;

import java.util.Scanner;

public class Windchill5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Temp:");
        int tempF = scan.nextInt();
        // System.out.println("Enter windspeed:");
        int windS = 5;
        double windChill;

        System.out.printf("%-10s %-5s %-5s %-5s %-5s %-5s", "Temperature", "Wind=5", "Wind=10", "Wind=15", "Wind=20",
                "Wind=25");
        System.out.println("------------------------------------------------------------------------");
        for (int j = 0; j < 20; j++) {

            // int Temperature;
            // System.out.println("Temp is" + tempF + "wind is" + windS + " wINDCHILL =" +
            // windChill);
            if (j % 5 == 0) {
                System.out.println(
                        "-------------------------------------------------------------------------------------------------------");
            }

            System.out.printf("%d", tempF);
            for (int i = 0; i < 5; i++) {
                windChill = (0.6215 * tempF) - (35.75 * (Math.pow(windS, 0.16)))
                        + (0.4275 * tempF * (Math.pow(windS, 0.16))) + (35.74);
                System.out.printf("%-5s", (int) windChill);
                windS += 5;
            }
            System.out.println(" ");
            tempF--;
        }

        scan.close();

    }

}
