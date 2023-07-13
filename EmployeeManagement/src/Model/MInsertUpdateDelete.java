
package Model;
import java.sql.*;
import javax.swing.JOptionPane;


public class MInsertUpdateDelete {
    public static void setData(String Query,String msg)
    {
        Connection con=null;
        Statement st=null;
        try
        {
            con=MyDBConnection.createDBConnection();
            st=con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null,msg);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        finally
        { 
        try
        {}
        catch(Exception e)
        {}
        }
    }
}
