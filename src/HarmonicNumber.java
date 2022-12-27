import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter number :");
        int num = scan.nextInt();
        double  value = 0;
        for (int i = 1; i <= num; i++) {
            value = value + (double) 1 / i;
        }
        System.out.println("Nth Harmonic Number is : " + value);
    }
}
