package labs.lab2;

public class FtoC {
    public static void main(String[] args) {
      double tempF = Double.valueOf(args[0]);
      double tempC = (5/9) * (tempF - 32);

      System.out.println("My temp is " + tempC);
    }
}
