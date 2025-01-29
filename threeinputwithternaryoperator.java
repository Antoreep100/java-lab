import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter First num:");
        int x=scanner.nextInt();
        System.out.print("Enter Second num:");
        int y=scanner.nextInt();
        System.out.print("Enter Third num:");
        int z=scanner.nextInt();
        
        int ans=(x>y)?(y>z?y:z):(z>x?z:x);
        System.out.print("This is the largest number:" + ans);

	

	}
}
