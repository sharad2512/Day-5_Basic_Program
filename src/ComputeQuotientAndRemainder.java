import java.util.Scanner;

public class ComputeQuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number1 and Number 2 :-");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        double quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("Quotient is : " + quotient+"\n"+"Remainder is : "+remainder);
    }
}
