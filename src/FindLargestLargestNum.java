import java.util.Scanner;

public class FindLargestLargestNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st Numbers : ");
        int number1 = scan.nextInt();
        System.out.println("Enter 2nd Numbers : ");
        int number2 = scan.nextInt();
        System.out.println("Enter 3rd Numbers : ");
        int number3 = scan.nextInt();
        if (number1 > number2 && number1 > number3){
            System.out.println(number1+"is Largest number ");
        } else if (number2 > number3) {
            System.out.println(number2+" is largest number ");
        }else {
            System.out.println(number3+" is Largest number ");
        }
    }
}
