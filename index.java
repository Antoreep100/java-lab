import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] myList = new int[5];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + myList.length + " integer values: ");

        for (int i = 0; i < myList.length; i++) 
        {
            myList[i] = input.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(myList));

        int max = myList[0];
       int  index = 0;
        for (int i = 1; i < myList.length; i++) {
            if(myList[i] > max )
            {
                max=myList[i];
                index=i;
                
            }
        }
        System.out.println("mAx " + max);
         System.out.println("Index " + index);  
    }
}
