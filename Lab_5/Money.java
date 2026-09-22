import java.util.Scanner;
interface Salary 
{
    void earnings(double basic);
    void deductions(double basic);
    void bonus(double basic);
}

abstract class Manager implements Salary 
{
    public void earnings(double basic) 
    {
        double earn = basic + (0.8 * basic) + (0.15 * basic);
        System.out.println("Earnings - " + earn);
    }

    public void deductions(double basic) 
    {
        double ded = 0.12 * basic;
        System.out.println("Deduction - " + ded);
    }
}

class Substaff extends Manager 
{
    public void bonus(double basic) 
    {
        double b = 0.5 * basic;
        System.out.println("Bonus - " + b);
    }
}

public class Money 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic salary - ");
        double basic = sc.nextDouble();

        Substaff s = new Substaff();
        s.earnings(basic);
        s.deductions(basic);
        s.bonus(basic);
        sc.close();
    }
}
