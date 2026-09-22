import java.util.Scanner;
public class ArithmeticExceptionDemo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 0;
        try 
        {
            int result = a / b;   
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("ArithmeticException caught by try-catch block");
        } 
        finally 
        {
            System.out.println("Finally block executed");
        }
        sc.close();
    }
}
