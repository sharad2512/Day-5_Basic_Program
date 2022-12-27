import java.util.Scanner;

public class CheckAlphabetVowelConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Alphabet :");
        char character = scan.next().charAt(0);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println("character is vowel");
        } else {
            System.out.println("character is consonant");
        }
    }
}
