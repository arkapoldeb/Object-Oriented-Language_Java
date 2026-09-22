import java.util.Scanner;
class Employee 
{
    protected int empid;
    String ename;

    void setData(int id, String name) 
    {
        empid = id;
        ename = name;
    }

    double earnings(double basic) 
    {
        return basic + (0.8 * basic) + (0.15 * basic);
    }
}

class Sales extends Employee 
{

    double tallowance(double earning) 
    {
        return 0.05 * earning;
    }
}
public class Earnings 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id and employee name: ");
        int id = sc.nextInt();
        String name = sc.next();
        System.out.print("Enter the basic salary: ");
        double basic = sc.nextDouble();
        Sales s = new Sales();
        s.setData(id, name);
        double earning = s.earnings(basic);
        double totalEarning = earning + s.tallowance(earning);
        System.out.println("The emp id of the employee is " + s.empid);
        System.out.println("The total earning is " + totalEarning);
        sc.close();
    }
}
