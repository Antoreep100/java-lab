
public class Main
{
	public static void main(String[] args)
	{

	int number=15;
	int firstnumber =0;
	int secondnumber =1;
	System.out.println("The fibonacci number upto 15:");
	
	for(int i=1;i<=15;i++)
	{
	    System.out.print(firstnumber+ " ");
	    int update = firstnumber + secondnumber;
	    firstnumber = secondnumber;
	    secondnumber = update;
	}
	

	}
}
