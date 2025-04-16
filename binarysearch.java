public class Main {
    public static void main(String[] args) 
    {
        int[] arr = {5, 3, 8, 6, 1,7,9};
        int key = 6;
       

        int index = binarySearch(arr, key);
        System.out.println("Element found at index: " + index);  
    }

    
    public static int binarySearch(int[] arr, int key) {
        int low =0;
        int high =arr.length-1;
        while(high>=low)
        {
            int mid= (low + high)/2;
            if(key<arr[mid])
            {
                high=mid-1;
            }
            else if (key == arr[mid])
            {
                return mid;
            }
            else
            {
                low = mid+1;
            }
        
        }
          return -1 -low;
    }
}
