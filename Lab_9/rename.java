import java.sql.*;
import java.util.Scanner;
public class rename 
{
    public static void main(String args[]) 
    {
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
            "jdbc:oracle:thin:@127.0.0.1:1521:XE",
            "Arkapol",
            "Arkapol");

            Scanner sc = new Scanner(System.in);

            Statement stmt = con.createStatement();

            System.out.print("Enter rollno: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter Address: ");
            String add = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter CGPA: ");
            double marks = sc.nextDouble();

            int i = stmt.executeUpdate(
            "INSERT INTO student (ROLL_NO,NAME,ADDRESS,AGE,CGPA) VALUES("+roll+",'"+name+"','"+add+"',"+age+","+marks+")");

            System.out.println(i + " record inserted");

            System.out.print("Enter rollno to update: ");
            int r2 = sc.nextInt();

            System.out.print("Enter new CGPA: ");
            double m2 = sc.nextDouble();

            stmt.executeUpdate(
            "UPDATE student SET CGPA="+m2+" WHERE ROLL_NO="+r2);

            System.out.println("Record updated");

            System.out.print("Enter rollno to delete: ");
            int r3 = sc.nextInt();
            stmt.executeUpdate(
            "DELETE FROM student WHERE ROLL_NO="+r3);

            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            System.out.println("\nROLL\tNAME\tADDRESS\tAGE\tCGPA");
            System.out.println("-------------------------------------------");

            while(rs.next()) {
                int r = rs.getInt("ROLL_NO");
                String n = rs.getString("NAME");
                String a = rs.getString("ADDRESS");
                int ag = rs.getInt("AGE");
                double cg = rs.getDouble("CGPA");

                System.out.println(r+"\t"+n+"\t"+a+"\t"+ag+"\t"+cg);
            }
            sc.close();
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}