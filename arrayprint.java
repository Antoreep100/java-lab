import java.util.*;
public class Main{
  public static void main(String[] args)
  {
      Random rand = new Random();
int[] myList = new int[5];

Scanner input = new Scanner(System.in);

System.out.print("Enter " + myList.length + " double values: ");

for (int i = 0; i < myList.length; i++)
{

myList[i] = input.nextInt();
}
System.out.println("Array elements: " + Arrays.toString(myList));
}
}
