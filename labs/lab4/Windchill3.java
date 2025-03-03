package labs.lab4;
import java.util.Scanner;
public class Windchill3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Temp:");
        double tempF = scan.nextDouble();
        System.out.println("Enter windspeed:");
        double windS = scan.nextDouble();
        double windChill; 
    scan.close();
       
        //System.out.println("Temp is" + tempF + "wind is" + windS + " wINDCHILL =" + windChill);

        int Count = 0;
        while (Count <15){
            windChill = (0.6215 * tempF) - (35.75 * (Math.pow(windS, 0.16))) + (0.4275 * tempF * (Math.pow(windS, 0.16))) + (35.74);
            System.out.printf("Temp is %.1f Wind is %.1f Windchill = %.1f\n", tempF, windS, windChill);
            windS++;
            Count++;
        }





       /* windChill = (0.6215 * tempF) - (35.75 * (Math.pow(windS, 0.16))) + (0.4275 * tempF * (Math.pow(windS, 0.16))) + (35.74);
        if (windS <0) {
            System.out.println("ERROR IN SYSTEM");
        }else if (windS <4){
            System.out.println("the windchil is " + windS);
        }else{
            System.out.println(" the wind change will be " + windChill);
        }
            */ 
            
        }
             }         


    

