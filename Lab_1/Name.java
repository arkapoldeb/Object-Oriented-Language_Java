import java.util.Scanner;
public class Name
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Name: ");
       String name = sc.next();
       System.out.println("Enter roll No: ");
       int roll = sc.nextInt();
       System.out.println("Enter Stream: ");
       String stream = sc.next();
       System.out.println("Enter Section: ");
       int sec = sc.nextInt();

       //Outputs

       System.out.println("Name: " +name);
       System.out.println("Section: " +sec);
       System.out.println("RollNo: " +roll);
       System.out.println("Stram: " +stream);

       sc.close();

    }
}