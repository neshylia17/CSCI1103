package labs.lab9;

public class Rational {
    // attributes here
    private int numerator;
    private int denominator;

    // constructors here
    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int num, int denom) {
        numerator = num;
        denominator = denom;
    }

    // num getter
    public int getNumerator() {
        return numerator;
    }

    // num setter
    public void setNumerator(int num) {
        numerator = num;
    }

    // denom getter
    public int getDenominator() {
        return denominator;
    }

    // denom setter
    public void setDenominator(int denom) {
        denominator = denom;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    // methods here
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2); // rational number 1/2
        Rational r2 = new Rational(3, 4); // 3/4
        Rational r3 = new Rational(); // defult constructor

        // optional: include a main() method to test or demonstrate here

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);

    }
}
