import java.util.Scanner;
public class Grade
{
    public static void main(String[] args) 
    {
        int Gr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks: ");
        Gr = sc.nextInt();
        if (Gr > 100 || Gr < 40) 
        {
            System.out.println("Invalid Marks!!");
        }
        else if(Gr >= 90)
        {
            System.out.println("Grade: O");
        }
        else if(Gr >= 80) 
        {
            System.out.println("Grade: E");
        }
        else if(Gr >= 70)
        {
            System.out.println("Grade: A");
        }
        else if(Gr >=60)
        {
            System.out.println("Grade: B");
        }
        else if(Gr >=50)
        {
            System.out.println("Grade: C");
        }
        else
        {
            System.out.println("Grade: D");
        }
        sc.close();
    }
}