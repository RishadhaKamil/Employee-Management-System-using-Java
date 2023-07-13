
package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import View.*;  

public class MLogin {
    public void loginCustomer(String uname,String upwd)
    {  
       int check=0;
        try
        {
            Statement st=MyDBConnection.createDBConnection().createStatement();
            ResultSet myresult= st.executeQuery("SELECT email,Password FROM tblUser WHERE email='"+uname+"'&& Password='"+upwd+"'");
            if( myresult.next())
            {   check=2;
                
            }
            MyDBConnection.createDBConnection().close();
            if(check==2)
            {  
                String vr="";
                Statement str=MyDBConnection.createDBConnection().createStatement();
                ResultSet rs=str.executeQuery("Select * from tblEmployee WHERE email='"+uname+"'&& password='"+upwd+"'");
                
                 if( rs.next())
            {   
                vr=rs.getString(8);
            } 
                if(vr.equals("true"))
                 { 
                     check=1;
                   JOptionPane.showMessageDialog(null,"you are logged in successully");
                  
                   new VEmpHome().setVisible(true);
                    
                 }
                 else
                 { 
                     check=1;
                     JOptionPane.showMessageDialog(null,"Wait for Admin Approval");
                 }
            }
           if(check==0)
            {
                JOptionPane.showMessageDialog(null,"Invalid username and password"); 
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
      
    }
}
