
package Model;

import java.sql.*;
import javax.swing.JOptionPane;

public class MSelect {
    public static ResultSet getData(String query)
    {
     Connection con=null;
     Statement st=null;
     ResultSet rs=null;
     try
     {
      con=MyDBConnection.createDBConnection();
      st=con.createStatement();
      rs=st.executeQuery(query);
      return rs;
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e.getMessage());
         return null;
     }
    }
}
