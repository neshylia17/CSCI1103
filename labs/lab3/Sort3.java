package labs.lab3;

public class Sort3 {
    public static void main(String[] args) {
        double num1 = Double.valueOf(args[0]);
        double num2= Double.valueOf(args[1]);
        double num3= Double.valueOf(args[2]);
        double small = num1;
        double middle = num2;
        double large = num3;
        

        System.out.println(num1 + " " + num2 + " " + num3);

        if(num1 < num2 && num1 < num3) {
            small = num1;
            if (num2 > num3) {
                middle = num3;
                large = num2;
            } else {
                middle = num2;
                large = num3;
            }
        }else if (num2 < num3 && num2 < num1) {
            small = num2;
            if (num1 < num3) {
                middle = num1;
                large = num3;
            } else {
                large = num1;
                middle = num3;
            }
            
        }else if 
        (num3 < num2 && num3 < num1){
            small = num3;
            if (num1 < num2) {
                middle = num2;
                large = num1;
            } else {
                middle = num1;
                large = num2;
            }
        }


        System.out.println(small + " " + middle + " " + large);

        // System.out.println("The three numbers you entered : " + small +", middle ") ;
        // System.out.println(" is " + middle + " large is " + large + " The three numbers you entered: ");
        // System.out.println(" large is " + large + " middle is " + middle + " small is " + small);
    }
}
