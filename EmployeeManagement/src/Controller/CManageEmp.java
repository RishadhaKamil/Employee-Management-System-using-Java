
package Controller;

import Model.MManageEmp;

import java.sql.ResultSet;

      
public class CManageEmp {
     public void createEmp(String name,String email,String gender,String pwd,String status,String adrs,String qualification,String mydob,double bsalary)
    {
        MManageEmp mc =new MManageEmp();
        mc.createEmp(name,email,gender,pwd,status,adrs,qualification,mydob,bsalary);
    }
     
      public void delData(int eid)
    {
        MManageEmp msc =new MManageEmp();
        msc.delData(eid);
    }
     
     public ResultSet getData(int id)
    {
       
        MManageEmp mc =new MManageEmp();
        ResultSet rs=mc.getData(id);
        return  rs ;
        
    }
     public void updateEmp(String name,String email,String gender,String pwd,String status,String adrs,String qualification,String mydob,double bsalary,int eid)
    {
        MManageEmp mc =new MManageEmp();
        mc.updateEmp(name,email,gender,pwd,status,adrs,qualification,mydob,bsalary,eid);
    }
}
