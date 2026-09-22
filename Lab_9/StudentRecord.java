import java.sql.*;
class DisplayRecords {
    void showRecords() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","Arkapol","Arkapol");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT");
            while(rs.next()) 
            {
                System.out.println
                (
                rs.getInt(1)+" "
                +rs.getString(2)+" "
                +rs.getInt(3));

            }
            con.close();
        } 
        catch(Exception e) 
        {
            System.out.println(e);
        }
    }
}
public class StudentRecord 
{
    public static void main(String args[]) 
    {
        DisplayRecords obj = new DisplayRecords();
        obj.showRecords();

    }
}