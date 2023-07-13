
package Model;
import java.sql.*;
import javax.swing.JOptionPane;

public class MTables {
    public static void main(String[] args)
    {
    Connection con=null;
    Statement st=null;
    try
    {
        con=MyDBConnection.createDBConnection();
        st=con.createStatement();
        st.executeUpdate("create table users(name)");
        JOptionPane.showMessageDialog(null,"Table creaed Sucessfully");
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    finally
    {  try
    {
        con.close();
        st.close();
    }
    catch(Exception e)
    {}
    }
    
    }
    
}
