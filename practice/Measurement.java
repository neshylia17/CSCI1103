package practice;

import java.util.Scanner;

public class Measurement {
    public static void main(String[] args) {
        int Size = Integer.parseInt(args[0]);
        double[] myArray = Populate(Size);
        double average = Calculate(myArray);
        double largest = large(myArray);
        double smallest = small(myArray);
        System.out.println(" The avergae is : " + average);
        System.out.println(" The largest is : " + largest);
        System.out.println(" The smallest is : " + smallest);
    }

    public static double[] Populate(int size) {
        Scanner scan = new Scanner(System.in);
        double[] S = new double[size];
        System.out.println(" Give me " + size + " arguments:");
        for (int i = 0; i < S.length; i++) {
            S[i] = scan.nextDouble();
        }
        scan.close();
        return S;
    }

    public static double Calculate(double[] C) {
        double avergae = 0;
        for (int i = 0; i < C.length; i++) {
            avergae += C[i];
        }
        avergae = avergae / C.length;
        return avergae;
    }

    public static double large(double[] A) {
        double largest = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > largest) {
                largest = A[i];
            }
        }
        return largest;
    }

    public static double small(double[] B){
        double smallest = B[0];
        for (int i = 0; i < B.length; i++){
            if (B[i] < smallest){
                smallest = B[i];
            }
        }
        return smallest;
    }

}
