import java.sql.*;
import java.util.Scanner;

public class fetch {

    public static void main(String args[]) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
            "jdbc:oracle:thin:@127.0.0.1:1521:XE",
            "Arkapol",
            "Arkapol");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Rollno: ");
            int roll = sc.nextInt();

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
            "SELECT * FROM student WHERE roll_no=" + roll);

            while(rs.next()) {

                int r = rs.getInt("ROLL_NO");
                String name = rs.getString("NAME");
                String address = rs.getString("ADDRESS");
                int age = rs.getInt("AGE");
                double cgpa = rs.getDouble("CGPA");

                System.out.println(r+" "+name+" "+address+" "+age+" "+cgpa);
            }
            sc.close();
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}