package labs.lab8;

import java.util.Scanner;

public class Geocalc2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
    
        int choice;
        printMenu();
        choice = scnr.nextInt();
        if (choice == 1){
            double Acircle = calculateCircle(scnr);
        }
        else if (choice == 2){
          double Arectangle = calculateRetangle(scnr);
        }
        else if (choice == 3){
             double Atraiange = calculateTriangle(scnr);
        }
        else if (choice == 4){
            int Quit;
            System.out.println(" Exiting the program. See you agian soon! ");
        }
        else{
            System.out.println(" Invald! Enter numbers bewtween 1-4. ");
        }
    
    }
        
        public static double calculateCircle(Scanner scnr){
            System.out.println(" give us a radius");
            double Radius = scnr.nextDouble();
            double Acircle = Math.PI * (Math.pow( Radius, 2.0));
            String result = " The area of the circle will be " + Acircle;
            displayResult(result);
            return Acircle;
        }
        


        public static double calculateRetangle(Scanner scnr){
            System.out.println(" give us a length");
            double Length = scnr.nextDouble();
            System.out.println(" give us a width");
            double Width = scnr.nextDouble();
            double Arectangle = Length * Width;
            String result = " The area of the retangle will be " + Arectangle;
            displayResult(result);
            return Arectangle;
        }
        


        public static double calculateTriangle(Scanner scnr){
            System.out.println(" lengths of the three sides, a, b, and c");
            double A = scnr.nextDouble();
            double B = scnr.nextDouble();
            double C = scnr.nextDouble();
            double S = (A + B + C)/2;
            double Atraiange = Math.sqrt(S * (S - A) * ((S - B) * ((S - C))));
            String result = " The area of the triangle will be " + Atraiange;
            displayResult(result);
            return Atraiange;
        }
            
        public static void printMenu(){
        System.out.println(" Geometry Calculator\n" + 
            "1. Calculate the Area of a Circle\n" + 
            "2. Calculate the Area of a Rectangle\n" + 
            "3. Calculate the Area of a Triangle\n" + 
            "4. Quit\n" + 
            "Enter your choice (1 – 4):");
        }

      public static void displayResult(String result){
        System.out.println(result);
      }
    
    
}

   

    


