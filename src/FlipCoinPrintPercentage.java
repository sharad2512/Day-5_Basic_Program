import java.util.Scanner;

public class FlipCoinPrintPercentage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls Insert Number To How Much Time You Want To Flip Coin :");
        int num = scan.nextInt();
        int count = 0;
        float head = 0;
        float tail = 0;
        for (int i = 0; i < num; i++) {
            if (Math.random() < 0.5) {
                tail = tail + 1;
            } else {
                head = head + 1;
            }
        }
        System.out.println("Head Count is : " + head + "\n" + "Tail Count is : " + tail);
        float percentageOfHead = (head * 100) / num;
        float percentageOfTail = (tail * 100) / num;
        System.out.println("Percentage Of Head is : " + percentageOfHead + "%" + "\n" + "Percentage of Tail is : " + percentageOfTail + "%");
    }
}
