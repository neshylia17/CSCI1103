package labs.lab2;

public class Windchill {
    public static void main(String[] args) {
        
       double tempF = Double.valueOf(args[0]);
       double windS = Double.valueOf(args[1]);
       double windChill= 
        windChill = (0.6215 * tempF) -3 (35.75 * (Math.pow(windS, 0.16))) + (0.4275 * tempF * (Math.pow(windS, 0.16))) + (35.74);

        System.out.println(" the wind change will be " + windChill);
    }
}
