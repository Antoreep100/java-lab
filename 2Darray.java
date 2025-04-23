import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
      Scanner scan =new Scanner(System.in) ;
      int[][] arrays=new int [10][10];
      for(int i=0;i<arrays.length;i++)
      {
          for(int j=0;j<arrays[i].length;j++){
              System.out.print("* ");
            
          }
         System.out.println();
      }
    }
}
