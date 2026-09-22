import java.util.Scanner;
interface Employee 
{
    void getEmpDetails(int id, String name);
}

interface Manager extends Employee 
{
    void getDeptDetails(int did, String dname);
}

class Head implements Manager 
{
    int empid, deptid;
    String empname, deptname;

    public void getEmpDetails(int id, String name) 
    {
        empid = id;
        empname = name;
    }

    public void getDeptDetails(int did, String dname) 
    {
        deptid = did;
        deptname = dname;
    }

    void display() 
    {
        System.out.println("\n Output \n");
        System.out.println("Employee id - " + empid);
        System.out.println("Employee name - " + empname);
        System.out.println("Department id - " + deptid);
        System.out.println("Department name - " + deptname);
    }
}

public class Dept 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id - ");
        int eid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee name - ");
        String ename = sc.nextLine();
        System.out.print("Enter department id - ");
        int did = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter department name - ");
        String dname = sc.nextLine();
        Head h = new Head();
        h.getEmpDetails(eid, ename);
        h.getDeptDetails(did, dname);
        h.display();
        sc.close();
    }
}
