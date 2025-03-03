package labs.lab5;

public class Patterns {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int n = 10;
        while (a <= n) {
            b = 1;
            while (b <= 2 * a - 1) {
                System.out.print("*");
                b++;
            }
            System.out.println("");
            a++;

        }

    }
}
