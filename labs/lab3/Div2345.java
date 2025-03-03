package labs.lab3;

public class Div2345 {
    public static void main(String[] args) {
        int div2 = Integer.valueOf(args[0]);
        System.out.println(div2);
        if (div2 % 2 == 0 ){
            System.out.println( div2 + " is divisible by 2." );

        }if (div2 % 3 == 0){
            System.out.println(div2 + " is divisable by 3.");

        }if (div2 % 4 == 0){
            System.out.println(div2 + " is divisable by 4.");

        }if (div2 % 5 == 0){
            System.out.println(div2 + " is divisable by 5");
        
        }else{
            System.out.println(" Not divisbale by anything");
        }
    }
}
