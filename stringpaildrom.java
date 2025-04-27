import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();  // Input string

        String reverse = ""; // Initialize reverse string

        // Reverse the string manually by adding one letter at a time
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);  // Reverse by adding characters
        }

        // Check if the original string is equal to the reversed string
        if (original.equals(reverse)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }

        // Close scanner
        scanner.close();
    }
}
