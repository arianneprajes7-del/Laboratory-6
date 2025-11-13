import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equalsIgnoreCase(reversed))
            System.out.println("It is a Palindrome.");
        else
            System.out.println("It is not a Palindrome.");
    }
}