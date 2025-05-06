class Program
{
    static String MyFunction(String i)
    {
        return i;
    }
    static char MyFunction(char i)
    {
        return i;
    }
}
public class Main
{
    public static void main (String[] args)
    {
        System.out.println(Program.MyFunction("Antoreep"));
        System.out.println(Program.MyFunction('A'));
    }
}
