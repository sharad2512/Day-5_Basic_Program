import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Year In Four Digit :- ");
        int year = scan.nextInt();
        if ((year > 999) && (year < 1000)) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is leap year");
            } else {
                System.out.println(year + " is not leap year");
            }
        } else {
            System.out.println("Invalid input please Enter Four Digit Number");
        }
    }
}
