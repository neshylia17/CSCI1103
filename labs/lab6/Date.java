
import java.time.Year;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a date in mm/dd/yyyy format:\n");

        String Date = input.nextLine();

        int First = Date.indexOf("/");
        Date.replace("/", "");
        int Sec = Date.indexOf("/") + 2;

        String month = Date.substring(0, First);
        String day = Date.substring(First + 1, Sec + 1);
        String year = Date.substring(Sec + 2);

        System.out.println("Year, Month, Day: " + " " + year + " " + month + " " + day);

    }
}
