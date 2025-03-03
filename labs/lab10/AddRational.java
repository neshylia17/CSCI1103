// package labs.lab10;

public class AddRational {
    private int numerator;
    private int denominator;

// constructors here
public AddRational() {
    numerator = 0;
    denominator = 1;
}

public AddRational(int num, int denom) {
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

public AddRational multiply(AddRational r) {
    int newNumerator = numerator * r.getNumerator();
    int newDenominator = denominator * r.getDenominator();
    return new AddRational(newNumerator, newDenominator);
}

public AddRational add(AddRational r) {
    int commonDenominator = denominator * r.getDenominator(); //finding the common denominator
    int newNumerator = (numerator * r.getDenominator()) + (r.getNumerator() * denominator); //adjusting the numerators
    return new AddRational(newNumerator, commonDenominator);
}

public void copy(AddRational anotherRational) {
    anotherRational.setNumerator(numerator);
    anotherRational.setDenominator(denominator);
}

public String toString() {
    return numerator + "/" + denominator;
}

// methods here
public static void main(String[] args) {
AddRational r1 = new AddRational(1, 2); // rational number 1/2
AddRational r2 = new AddRational(3, 4); // 3/4
AddRational r3 = new AddRational(); // defult constructor

// optional: include a main() method to test or demonstrate here

System.out.println("r1: " + r1);
System.out.println("r1 as a decimal: " + r1.toDecimal());
System.out.println("r2: " + r2);
System.out.println("r2 as a decimal: " + r2.toDecimal());

r3 = r1.add(r2); // adding 1/4 and 3/8
System.out.println("Adding r1 and r2 will result in: " + r3);

r3 = r1.multiply(r2); // 1/2 times 3/4
System.out.println("Multiplying r1 and r2 will result in: " + r3);

System.out.println("r3 before copy: " + r3);
r1.copy(r3);
System.out.println(r3.toString());

}
}

 

