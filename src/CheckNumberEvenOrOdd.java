import java.util.Scanner;

public class CheckNumberEvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Plz Enter value:- ");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even number..");
        } else {
            System.out.println(number + " is odd number..");
        }
    }
}
