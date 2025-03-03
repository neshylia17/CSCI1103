package labs.lab4;

import java.util.Scanner;

public class Windchill4 {
    public static void main(String[] args) {
         Scanner scan = new Scanner (System.in);
        System.out.println("Enter Temp:");
        double tempF = scan.nextDouble();
        System.out.println("Enter windspeed:");
        double windS = scan.nextDouble();
        double windChill; 
    scan.close();
       int Temperature
        //System.out.println("Temp is" + tempF + "wind is" + windS + " wINDCHILL =" + windChill);
        System.out.println(" Temperature  Wind  Windchill"    );
        System.out.println("---------------------------------");
        int Count = 0;
        while (Count <15){
            windChill = (0.6215 * tempF) - (35.75 * (Math.pow(windS, 0.16))) + (0.4275 * tempF * (Math.pow(windS, 0.16))) + (35.74);
            System.out.printf(" %2.1f         %2.1f      %2.1f\n", tempF, windS, windChill);
            windS++;
            Count++;
            if (Count %5 == 0){
                System.out.println("---------------------------------");

            }
        }

    }
}
