import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner scanner = new Scanner(System.in);
	  System.out.print("Enter the number:");
	  int x=scanner.nextInt();
	 int sum=0;
	 for(int i =1;i<=x;i++)
	 {
	     if(x%i==0)
	     {
	         sum +=i;
	     }
	    
	 }
	
 if(sum==x)
	     {
	         System.out.print("Yes,This is the Perfect number");
	     }
	     else{

            System.out.print("No,It is not perfect number");
	     }
	}
}
