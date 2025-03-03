package labs.lab9;

public class MultDiv {
    private int numerator;
    private int denominator;

// constructors here
public MultDiv() {
    numerator = 0;
    denominator = 1;
}

public MultDiv(int num, int denom) {
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

public double toDecimal() {
    return (double) numerator / denominator;
}

public MultDiv multiply(MultDiv r) {
    int newNumerator = numerator * r.getNumerator();
    int newDenominator = denominator * r.getDenominator();
    return new MultDiv(newNumerator, newDenominator);
}
public String toString() {
    return numerator + "/" + denominator;
}

// methods here
public static void main(String[] args) {
MultDiv r1 = new MultDiv(1, 2); // rational number 1/2
MultDiv r2 = new MultDiv(3, 4); // 3/4
MultDiv r3 = new MultDiv(); // defult constructor

// optional: include a main() method to test or demonstrate here

System.out.println("r1: " + r1);
System.out.println("r1 as a decimal: " + r1.toDecimal());
System.out.println("r2: " + r2);
System.out.println("r2 as a decimal: " + r2.toDecimal());

r3 = r1.multiply(r2); // 1/2 times 3/4
System.out.println("Calculated r3: " + r3);

}
}



