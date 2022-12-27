import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number :");
        int num = scan.nextInt();
        int fact = 2;
        System.out.println("Prime Factor Of "+num+" is :");
        while (num > 1) {
            if (num % fact == 0) {
                System.out.println(fact);
                num = num / fact;

            } else {
                fact++;
            }
        }

    }
}
