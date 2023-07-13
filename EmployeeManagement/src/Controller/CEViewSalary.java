
package Controller;
import Model.*;

public class CEViewSalary {
       public boolean confirmData(String email,int id)
    {
        boolean b;
        MEViewSalary mc =new MEViewSalary();
      return b= mc.confirmData( email, id);
    }
}
