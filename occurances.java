public class Main 
{
    public static void main(String[] args) 
    {
        int number =345222;
        int count = countOccurrencesOfTwo(number);
        System.out.println("The digit 2 appears " + count + " times.");
    }

    public static int countOccurrencesOfTwo(int number) 
    {
        int count = 0;

       
        while (number != 0) 
        {
            
            if (number % 10 == 2) 
            {
                count++;
            }
           
            number = number / 10;
        }

        return count;
    }
}
