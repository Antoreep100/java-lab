public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 1};
        int target = 6;

        int index = linearSearch(arr, target);

        System.out.println("Element " + target + " found at index: " + index);
    }

    // Linear search method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // return the index where it's found
            }
        }
        return -1; // not found
    }
}
