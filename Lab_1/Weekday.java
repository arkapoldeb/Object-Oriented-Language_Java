import java.util.Scanner;
public class Weekday 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int week;
        String day;
        System.out.print("Enter the week day: ");
        week = sc.nextInt();
        switch (week) 
        {
            case 1: day = "Sunday"; break;
            case 2: day = "Monday"; break;
            case 3: day = "Tuesday"; break;
            case 4: day = "Wednesday"; break;
            case 5: day = "Thursday"; break;
            case 6: day = "Friday"; break;
            case 7: day = "Saturday"; break;
            default: day = "Invalid weekday"; 
        }
        System.out.println("Weekday: " + day);
        sc.close();
    }
}
