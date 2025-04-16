
public class Main {
    public static void main(String[] args) {
        int[] values = new int[5];

        // Fill the array based on the given pattern
        for (int i = 1; i < 5; i++) {
            values[i] = i + values[i - 1];
        }

        // Update the first element
        values[0] = values[1] + values[4];

        // Print the final array
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }
}
