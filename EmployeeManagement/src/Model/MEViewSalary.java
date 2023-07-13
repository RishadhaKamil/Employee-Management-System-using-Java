
package Model;

import View.VEmpHome;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class MEViewSalary {
     public boolean confirmData(String email,int id)
    {  boolean b=false;
        try
        {
            Statement st=MyDBConnection.createDBConnection().createStatement();
            ResultSet myresult= st.executeQuery("SELECT email,empid FROM tblEmployee WHERE email='"+email+"'&& empid='"+id+"'");
            if( myresult.next())
            {    
                   JOptionPane.showMessageDialog(null,"Confirmed User! ");
                  
               
                    b=true;
                 
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Employee Id or  Password"); 
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return b;
}
}
