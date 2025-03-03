package labs.lab7;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] employeeId = {123, 124, 232, 212, 879, 654, 926};
        String[] employeeName = {"Frodo Baggins", "Samwise Gamgee", "Merry Brandywine", "Pippin Took", "Bilbo Baggins", "Legolas Greenleaf", "Gimli Gloin"};
        int[] hours = new int[7];
        double[] payRate = new double[7];
        double[] wages = new double[7];
        
        for (int i = 0; i < employeeId.length; ++i) {
            System.out.println("Hello " + employeeName[i] + " (ID number: " + employeeId[i] + ")");
            
            do {
                System.out.print("Please enter hours worked: ");
                hours[i] = scnr.nextInt();
                if (hours[i] < 0 || hours[i] > 60) {
                    System.out.println("Invalid hours. Hours must be between 0 and 60.");
                }
            } while (hours[i] < 0 || hours[i] > 60);

            do {
                System.out.print("Please enter pay rate: ");
                payRate[i] = scnr.nextDouble();
                if (payRate[i] < 15 || payRate[i] > 30) {
                    System.out.println("Invalid pay rate. Pay rate must be between 15 and 30.");
                }
            } while (payRate[i] < 15 || payRate[i] > 30);
        }

        //added print check before the main calculating the wage 
        printCheck(employeeName, employeeId, hours, payRate, wages);
    }

public static void printCheck(String[] employeeName, int[] employeeId, int[] hours, double[] payRate, double[] wages) {
        for (int i = 0; i < employeeId.length; i++) {
            double grossPay;
            double overTime = 0;

            if (hours[i] <= 40) {
                grossPay = hours[i] * payRate[i];
            } else {
                grossPay = 40 * payRate[i];
                overTime = (hours[i] - 40) * (payRate[i] * 1.5);
            }
            wages[i] = grossPay + overTime;

            System.out.println("       " + employeeName[i] + " (ID: " + employeeId[i] + ")");
            System.out.println("       " + "Hours worked: " + hours[i] + "  Pay rate: " + payRate[i]);
            System.out.println("                " + "Gross pay: " + wages[i]);
            System.out.println();
        }
    }
}
