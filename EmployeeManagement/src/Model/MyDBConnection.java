
package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;

public class MyDBConnection {
     
    public static Connection createDBConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB","root","");
          return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
       
    }
}
