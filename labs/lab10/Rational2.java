
public class Rational2 extends AddRational {
    private static int count = 0;
    private int index;

    // constructors here
    public Rational2() {
        super(); // parent class
        count++;
        index = count; // assign the creation order
    }

    public Rational2(int numerator, int denominator) {
        super(numerator, denominator); // constructer with parameters
        count++;
        index = count;
    }

    public int getIndex() {
        return index;
    }

    public String toString() {
        return "(" + index + ")" + super.toString();
    }

    // methods here
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        Rational2[] r = new Rational2[n];
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            int denominator = E.fact(i);
            r[i] = new Rational2(1, denominator);
            sum += r[i].toDecimal();
        }

        System.out.println(" sum of the series 1/0! + 1/2! + ... + 1/" + n + " ! =" + sum);

        // optional: include a main() method to test or demonstrate here

    }
}
