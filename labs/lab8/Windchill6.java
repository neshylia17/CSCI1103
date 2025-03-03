package labs.lab8;

import java.util.Scanner;

public class Windchill6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Temp:");
        double tempF = scan.nextDouble();
        System.out.println("Enter windspeed:");
        double windS = scan.nextDouble();

        printHeader();

        int Count = 0;
        while (Count < 15) {
            double windChill = (0.6215 * tempF) - (35.75 * (Math.pow(windS, 0.16)))
                    + (0.4275 * tempF * (Math.pow(windS, 0.16))) + (35.74);
            System.out.printf(" %2.1f         %2.1f      %2.1f\n", tempF, windS, windChill);
            windS++;
            Count++;

            if (Count % 5 == 0) {
                System.out.println("---------------------------------");

            }
        }
        scan.close();
    }

    

        public static void printHeader() {
            System.out.println(" Temperature  Wind  Windchill");
            System.out.println("---------------------------------");
        }



        public static double calculateWindChill(double tempF, double windS) {
            return (0.6215 * tempF) - (35.75 * (Math.pow(windS, 0.16))) + (0.4275 * tempF * (Math.pow(windS, 0.16)))
                    + (35.74);
        }
    

}










    


    


    






