package labs.lab3;

import java.util.Scanner;

public class Geocal {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double Acircle;
        double Arectangle;
        double Atraiange;
        int Quit;


        System.out.println(" Geometry Calculator\n" + //
                        "1. Calculate the Area of a Circle\n" + //
                        "2. Calculate the Area of a Rectangle\n" + //
                        "3. Calculate the Area of a Triangle\n" + //
                        "4. Quit\n" + //
                        "Enter your choice (1 – 4):");
         
        int Choice = scnr.nextInt();

        if (Choice == 1){ 
             System.out.println(" give us a radius");
            double Radius = scnr.nextInt();
            Acircle = Math.PI * (Math.pow( Radius, 2.0));
            System.out.println(" The area of the circle will be " + Acircle);
        }
        if (Choice == 2){
            System.out.println(" give us a length");
            int Length = scnr.nextInt();
            System.out.println(" give us a width");
            int Width = scnr.nextInt();
            Arectangle = Length * Width;
            System.out.println(" The area of the retangle will be " + Arectangle);
        }
        if (Choice == 3){
            System.out.println(" lengths of the three sides, a, b, and c");
            int A = scnr.nextInt();
            int B = scnr.nextInt();
            int C = scnr.nextInt();
            int S = (A + B + C)/2;
            Atraiange = Math.sqrt(S * (S - A) * ((S - B) * ((S - C))));
            System.out.println(" The area of the triangle will be " + Atraiange);
        }
        else{
            System.out.println(" Hope to see you again soon! ");
        }
            

        


    }
}
