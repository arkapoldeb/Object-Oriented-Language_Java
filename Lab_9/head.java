import java.sql.*;

public class head {

    public static void main(String args[]) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
            "jdbc:oracle:thin:@127.0.0.1:1521:XE",
            "Arkapol",
            "Arkapol");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            System.out.println("ROLL\tNAME\t\tADDRESS\t\tAGE\tCGPA");
            System.out.println("--------------------------------------------------------------");
            while(rs.next()) 
                {
                int roll = rs.getInt("ROLL_NO");
                String name = rs.getString("NAME");
                String address = rs.getString("ADDRESS");
                int age = rs.getInt("AGE");
                double cgpa = rs.getDouble("CGPA");
                System.out.print(roll + "\t");
                if(name.length() < 8)
                    System.out.print(name + "\t\t");
                else
                    System.out.print(name + "\t");

                if(address.length() < 8)
                    System.out.print(address + "\t\t");
                else
                    System.out.print(address + "\t");

                System.out.println(age + "\t" + cgpa);
            }
            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}