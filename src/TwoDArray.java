import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int row, column;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows");
        row = scan.nextInt();
        System.out.println("Enter number of columns");
        column = scan.nextInt();

        int[][] array = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter input for position (" + i + "," + j
                        + ")");
                array[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
