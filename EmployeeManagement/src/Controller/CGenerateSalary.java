
package Controller;

import Model.MGenerateSalary;
import java.sql.*;
public class CGenerateSalary {
    
     public ResultSet getData(int id)
    {
       
        MGenerateSalary mc =new MGenerateSalary();
        ResultSet rs=mc.getData(id);
        return  rs ;
        
    }
      public void setData(double bs,String mydob,double allowances,double etf,double epf,double other,double fs,int eid)
    {
        MGenerateSalary mc =new MGenerateSalary();
        mc.setData(bs,mydob,allowances,etf,epf,other,fs,eid);
    }
}
