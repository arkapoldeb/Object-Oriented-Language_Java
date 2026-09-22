import java.util.Scanner;
class InvalidHourException extends Exception 
{
    public InvalidHourException(String msg) 
    {
        super(msg);
    }
}
class InvalidMinuteException extends Exception 
{
    public InvalidMinuteException(String msg) 
    {
        super(msg);
    }
}

class InvalidSecondException extends Exception 
{
    public InvalidSecondException(String msg) 
    {
        super(msg);
    }
}

class Time 
{
    int hours, minutes, seconds;

    void getTime() throws InvalidHourException,InvalidMinuteException,InvalidSecondException 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        hours = sc.nextInt();
        if (hours < 0 || hours > 24) 
        {
            throw new InvalidHourException("hour is not greater than 24");
        }
        System.out.print("Enter minutes: ");
        minutes = sc.nextInt();
        if (minutes < 0 || minutes > 60) 
        {
            throw new InvalidMinuteException("hour is not greater than 60");
        }

        System.out.print("Enter seconds: ");
        seconds = sc.nextInt();
        if (seconds < 0 || seconds > 60) {
            throw new InvalidSecondException("hour is not greater than 60");
        }
        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
        
    }
}
public class TimeExceptionDemo 
{
    public static void main(String[] args) 
    {

        Time t = new Time();

        try 
        {
            t.getTime();
        } 
        catch (InvalidHourException e) 
        {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        } 
        catch (InvalidMinuteException e) 
        {
            System.out.println("Exception occurred: " + e);
        } 
        catch (InvalidSecondException e) 
        {
            System.out.println("Exception occurred: " + e);
        }
    }
}
