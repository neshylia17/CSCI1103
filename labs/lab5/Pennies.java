package labs.lab5;

import java.util.Scanner;

public class Pennies {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double Salary = 0.01;
        System.out.println("Enter the number of days worked.");
        int Days = scan.nextInt();
        double totalSalary = 0;

        while (Days < 5 || Days >30){
            System.out.println("Invalied please enter number between 5 and 30");
            Days = scan.nextInt();
        }

            
            System.out.println(" Days             Salary");
            System.out.println("--------          --------");

            int count = 0;

            while (count < Days){
                System.out.printf("%2d                   %2.2f\n", count, Salary);
                totalSalary += Salary;
                Salary *= 2;
                
                count++;
            }
            System.out.printf("Total Salary Earned:   %.2f\n", totalSalary);



                 
    scan.close();   
            }






        }


