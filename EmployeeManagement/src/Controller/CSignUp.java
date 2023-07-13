
package Controller;

import Model.MSignUp;


public class CSignUp {
     public void createEmp(String name,String email,String gender,String pwd,String adrs,String mydob ,String qualification)
    {
        MSignUp su =new MSignUp();
        su.createEmp(name,email,gender,pwd,adrs,mydob,qualification);
    }
    
}
