import java.util.*;
public class RevName
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Name: ");
        String fName=sc.next();
        System.out.println("Enter last Name: ");
        String lName=sc.next();
        //Before Changing
        System.out.println("Before Changing \n First Name: " + fName + "\n Last Name: " + lName);
        //After Changing
        System.out.println("After Changing \n First Name: " + lName + "\n Last Name: " + fName);
        sc.close();
    }
}