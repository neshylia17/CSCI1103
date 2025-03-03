package com.gradescope.lab_one;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Quadratic{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        solveQuadratic(a, b, c);
        scanner.close();
    }

    public static Set<Double> solveQuadratic(double a, double b, double c){
        
        Set<Double> roots = new HashSet<>();
        if ((Math.pow(b, 2) - 4 * a * c) < 0){
            roots.add(null);
            return roots;
        }
        else{

            Double xPlus;
            Double xMinus;
                
            xPlus = (-b+(Math.sqrt(Math.pow(b, 2) - 4 * a * c)))/ (2 * a);
            xMinus = ((-b-(Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a));

            roots.add(xPlus);
            roots.add(xMinus);
            
            System.out.println("is:" + roots);
            return roots;
    }
}
}