import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Read the input number
        int n = input.nextInt();
        
        // To calculate the first digit
        int first = n;
        while (first >= 10) {
            first /= 10;
        }
        
        // To calculate the last digit
        int last = n % 10;
        
        // Calculate the sum of all digits
        int sum = 0;
        int y = n; // Use n for digit sum calculation
        while (y != 0) {
            int dig = y % 10;
            sum += dig;
            y /= 10;
        }
        
        // Check the condition and print appropriate message
        if ((sum - first - last) == (first + last)) {
            System.out.println("It is xylem number.");
        } else {
            System.out.println("It is phloem number.");
        }
    }
}
