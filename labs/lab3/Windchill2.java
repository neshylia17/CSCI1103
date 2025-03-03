package labs.lab3;

public class Windchill2 {
    public static void main(String[] args) {
        double tempF = Double.valueOf(args[0]);
        double windS = Double.valueOf(args[1]);
        double windChill =

        windChill = (0.6215 * tempF) - (35.75 * (Math.pow(windS, 0.16))) + (0.4275 * tempF * (Math.pow(windS, 0.16))) + (35.74);
        
        if (windS <0) {
            System.out.println("ERROR IN SYSTEM");
        }else if (windS <4){
            System.out.println("the windchil is " + windS);
        }else{
            System.out.println(" the wind change will be " + windChill);
        }
            
        }
    }

    
