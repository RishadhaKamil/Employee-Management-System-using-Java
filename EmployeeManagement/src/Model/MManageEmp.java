
package Model;

import java.sql.ResultSet;


public class MManageEmp {
    
      public ResultSet getData(int id)
    {
        String query="Select name,email,password,gender,dob,address,status,basicsalary,qualification from tblEmployee where empid='"+id+"'";
       ResultSet rs=MSelect.getData(query);
        return rs;
    }
      
       public void createEmp(String name,String email,String gender,String pwd,String status,String adrs,String qualification,String mydob,double bsalary)
    {
        String query="INSERT INTO tblEmployee(name,email,password,gender,dob,address,status,basicsalary,qualification)VALUES('"+name+"','"+email+"','"+pwd+"','"+gender+"','"+mydob+"','"+adrs+"','"+status+"','"+bsalary+"','"+qualification+"')";
        String msg="Successfully inserted a new employee";
        MInsertUpdateDelete.setData(query, msg);
    }
       
        public void updateEmp(String name,String email,String gender,String pwd,String status,String adrs,String qualification,String mydob,double bsalary,int eid)
    {    
        String query="UPDATE tblEmployee set name='"+name+"',email='"+email+"',password='"+pwd+"',gender='"+gender+"',dob='"+mydob+"',address='"+adrs+"',status='"+status+"',basicsalary='"+bsalary+"',qualification='"+qualification+"' where empid='"+eid+"'";
        String msg="Successfully updated the employee details";
        MInsertUpdateDelete.setData(query, msg);
    }
        
         public void delData(int eid)
    {
        String query="Delete from tblEmployee where empid='"+eid+"'";
        String msg="Successfully Deleted the Employee Details";
        MInsertUpdateDelete.setData(query, msg);
    }
}
