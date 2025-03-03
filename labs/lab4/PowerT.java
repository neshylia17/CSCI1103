package labs.lab4;

import java.util.Scanner;

public class PowerT {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int b, n;
        double bn;
        b =  scan.nextInt();
        System.err.println("Power of : " + b);
        scan.close();

        System.out.println(" b      n       bn" );

         n = 0;
        while (0<=n && n<= 10){
            bn = Math.pow(b, n);
            System.out.printf(" %d %5d %10.0f\n", b, n, bn); 
        n++;

    }

    

    }

}
