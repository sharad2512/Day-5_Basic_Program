import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Value :-");
        int n = scan.nextInt();
        int powerOfTwo = 1;
        for (int i = 0; i < n; i++) {
            powerOfTwo = powerOfTwo * 2;
            System.out.println(i + "power of 2 is " + powerOfTwo);
        }
    }
}
