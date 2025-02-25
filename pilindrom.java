import java.util.Scanner;

public class SimplePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Reverse the string and compare with the original
        String reversed = "";
        
        // Build the reversed string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Check if the original string is the same as the reversed string
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();
    }
}
