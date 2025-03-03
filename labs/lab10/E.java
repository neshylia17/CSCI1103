// package labs.lab10;

import java.util.Scanner;

public class E {
    public static int fact(int n){
        int factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial *= i; 
        }
        return factorial;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to calculate the factorial");

        int number = scan.nextInt();

        if (number < 0){
            System.out.println("Please enter another number");
            number = scan.nextInt();
        }
        else{
            int answer = fact(number);
            System.err.println("The factorial of " + number + " is " + answer);
        }
        scan.close();
    }
}
