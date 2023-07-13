
package Model;

public class MSignUp {
     public void createEmp(String name,String email,String gender,String pwd,String adrs,String mydob,String qualification )
    {
         String query="INSERT INTO tblEmployee(name,email,password,gender,dob,address,qualification)VALUES('"+name+"','"+email+"','"+pwd+"','"+gender+"','"+mydob+"','"+adrs+"','"+qualification+"')";
        String msg="Successfully signed up as a new employee";
        MInsertUpdateDelete.setData(query, msg);
        
        String query1="INSERT INTO tblUser(email,Password)VALUES('"+email+"','"+pwd+"')";
        String msg2="";
        MInsertUpdateDelete.setData(query1, msg2);
       
    }
    
}
